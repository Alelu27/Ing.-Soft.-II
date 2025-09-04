package ejercicio_01.problema;

public class Cliente {

    public static void main(String[] args) {
        RPGFactory rpg = new RPGFactory();
        FPSFactory fps = new FPSFactory();
        PuzzleFactory pzl = new PuzzleFactory();
        
        System.out.println("===== RPG =====");
        rpg.playGame();
        
        System.out.println("===== FPS =====");
        fps.playGame();
        
        System.out.println("===== PUZZLE =====");
        pzl.playGame();
    }
    
}
