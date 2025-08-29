package violations;

import solutions.Serviceable;

public class ServiceProduct extends Product implements Serviceable{

    private int duration;
    
    public ServiceProduct(String name, double basePrice, int duration) {
        super(name, basePrice);
        this.duration = duration;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1; // Incluye comisión de servicio
    }

    @Override
    public void scheduleService() {
        System.out.println("Servicio: '" + name + "'");
    }
    
    @Override
    public int getServiceDuration() {
        return duration;
    }
}