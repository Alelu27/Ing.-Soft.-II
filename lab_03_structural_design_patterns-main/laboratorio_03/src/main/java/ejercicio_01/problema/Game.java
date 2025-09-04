package ejercicio_01.problema;

public abstract class Game {
    protected String name;
    protected String genre;

    public abstract void start();

    public String getInfo() {
        return "Juego: " + name + " | Genero: " + genre;
    }
}