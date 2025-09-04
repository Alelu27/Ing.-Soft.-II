package ejercicio_02.problema;

public class Cliente {

    public static void main(String[] args) {
        GameElementFactory pcFact= new PCFactory();
        Character pcWar = pcFact.createWarrior();
        Weapon pcWea = pcFact.createWeapon();

        System.out.println("===== PC Game Elements =====");
        System.out.println(pcWar.getInfo());
        pcWar.attack();
        System.out.println(pcWea.getInfo());
        pcWea.use();

        System.out.println(" ");
        
        GameElementFactory mobFact = new MobileFactory();
        Character mWar = mobFact.createWarrior();
        Weapon mWea = mobFact.createWeapon();

        System.out.println("===== Mobile Game Elements =====");
        System.out.println(mWar.getInfo());
        mWar.attack();
        System.out.println(mWea.getInfo());
        mWea.use();
    }
}
