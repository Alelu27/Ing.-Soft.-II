package ejercicio_03.problema;

public class Cliente {

    public static void main(String[] args) {
        
        GameConfig.getIntance().setDebugMode(true);

        GameSession session = new GameSession();
        NetworkManager network = new NetworkManager();
        DatabaseManager database = new DatabaseManager();

        session.startSession();    
        network.connect();         
        database.saveData();       
    }
    
}
