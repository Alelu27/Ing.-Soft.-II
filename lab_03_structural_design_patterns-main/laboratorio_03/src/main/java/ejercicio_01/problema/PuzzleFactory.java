package ejercicio_01.problema;

public class PuzzleFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new PuzzleGame();
    }
}
