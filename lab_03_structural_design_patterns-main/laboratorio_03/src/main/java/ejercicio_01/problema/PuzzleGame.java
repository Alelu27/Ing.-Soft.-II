package ejercicio_01.problema;

public class PuzzleGame extends Game{
    public PuzzleGame(){
        this.name = "Criminal Case";
        this.genre = "Puzzle";
    }
    
    @Override
    public void start(){
        System.out.println("Cargando mapa del crimen...");
        System.out.println("Selecciona un objeto para acercarte");
    }
}
