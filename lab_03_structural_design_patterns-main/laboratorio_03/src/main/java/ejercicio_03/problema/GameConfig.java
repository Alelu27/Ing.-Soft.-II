package ejercicio_03.problema;

public class GameConfig {
    
    private static volatile GameConfig instance;
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    // Constructor público permite múltiples instancias
    public GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }
    
    public static GameConfig getIntance(){
        if (instance == null){
            synchronized  (GameConfig.class) {
            if (instance == null){
                instance = new GameConfig();
                }
            }
        }
        return instance;
    }
    
    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String url) {
        this.databaseUrl = url;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }
}
