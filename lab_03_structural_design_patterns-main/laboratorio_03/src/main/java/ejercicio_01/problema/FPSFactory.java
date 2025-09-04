package ejercicio_01.problema;

public class FPSFactory extends GameFactory {
    
    @Override
    public Game createGame() {
        return new FPSGame();
    }
}
