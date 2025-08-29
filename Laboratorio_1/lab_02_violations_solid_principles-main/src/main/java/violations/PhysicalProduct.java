package violations;

import solutions.Shippable;

public class PhysicalProduct extends Product implements Shippable {
    
    private double weight;
    
    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.15; // Incluye impuestos
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2.5; // $2.5 por kg
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }
}