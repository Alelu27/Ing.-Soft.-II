package ejercicio_03.problema;

class GameSession {
    public void startSession() {
        GameConfig config = GameConfig.getIntance();
        System.out.println("Iniciando sesion...");
        System.out.println("Debug mode: " + config.isDebugMode());
    }
}
