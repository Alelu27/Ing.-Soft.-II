package ejercicio_02.problema;

public class PCFactory implements GameElementFactory {
    @Override
    public Character createWarrior() {
        return new PCWarrior();
    }
    
    @Override
    public Weapon createWeapon() {
        return new PCSword();
    }
}
