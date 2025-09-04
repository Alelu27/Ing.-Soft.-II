package ejercicio_03.problema;

enum NetworkConfig {
    INSTANCE;

    private String serverIP = "192.168.30.1";
    private int port = 8040;

    public String getServerIP() {
        return serverIP;
    }

    public int getPort() {
        return port;
    }
}
