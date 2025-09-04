package ejercicio_01.problema;

public class RPGGame extends Game {

    public RPGGame() {
        this.name = "Epic Quest";
        this.genre = "RPG";
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura epica...");
        System.out.println("Selecciona tu clase de personaje");
    }
}
