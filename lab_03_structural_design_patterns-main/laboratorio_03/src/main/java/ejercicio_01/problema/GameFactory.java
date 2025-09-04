package ejercicio_01.problema;

public abstract class GameFactory {
    
    public abstract Game createGame();
    
    public void playGame(){
        Game game = createGame();
        System.out.println(game.getInfo());
        game.start();
    }
}
