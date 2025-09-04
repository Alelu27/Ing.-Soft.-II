package ejercicio_01.problema;

public class RPGFactory extends GameFactory {

    @Override
    public Game createGame(){
        return new RPGGame();
    }
    
}