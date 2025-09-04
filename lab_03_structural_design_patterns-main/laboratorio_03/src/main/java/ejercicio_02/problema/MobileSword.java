package ejercicio_02.problema;

public class MobileSword extends Weapon{
    public MobileSword (){
        this.name = "Espada";
        this.platform = "Mobile";
    }
    
    public void use(){
        System.out.println("Espada Mobile ataca con efectos basicos");
    } 
}
