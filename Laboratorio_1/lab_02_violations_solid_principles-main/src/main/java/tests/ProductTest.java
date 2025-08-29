/**
package tests;

import violations.DigitalProduct;
import violations.PhysicalProduct;
import violations.Product;
import violations.ServiceProduct;


public class ProductTest {
     public static void main(String[] args) {
        Product[] products = {
            new PhysicalProduct("Laptop", 1000.0, 2.5),
            new DigitalProduct("Software", 50.0),
            new ServiceProduct("Consultoría", 200.0)
        };
        
        for (Product product : products) {
            try {
                product.processOrder(); // Falla con DigitalProduct
            } catch (Exception e) {
                System.out.println("Error procesando " + product.getName() + ": " + e.getMessage());
            }
        }
    }
} **/