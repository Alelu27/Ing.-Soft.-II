package ejercicio_02.problema;

public abstract class Character {

    protected String name;
    protected String platform;

    public abstract void attack();

    public String getInfo() {
        return "Personaje: " + name + " | Plataforma: " + platform;
    }
}
