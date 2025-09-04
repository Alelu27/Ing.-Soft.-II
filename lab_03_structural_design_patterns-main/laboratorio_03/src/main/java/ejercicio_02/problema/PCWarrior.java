package ejercicio_02.problema;

public class PCWarrior extends Character {
    public PCWarrior (){
        this.name = "Guerrero";
        this.platform = "PC";
    }
    
    public void attack(){
        System.out.println("Guerrero PC ataca con efectos en HD");
    }
}
