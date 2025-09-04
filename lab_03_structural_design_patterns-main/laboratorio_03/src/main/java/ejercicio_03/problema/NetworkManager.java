package ejercicio_03.problema;

class NetworkManager {

    public void connect() {
        NetworkConfig config = NetworkConfig.INSTANCE;
        System.out.println("Conectando a: " + config.getServerIP() + "| Port: " + config.getPort());
    }
}
