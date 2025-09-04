package ejercicio_03.problema;

class DatabaseManager {
    public void saveData() {
        GameConfig config = GameConfig.getIntance();
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Maximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
