package tests;

import violations.PhysicalProduct;
import violations.DigitalProduct;
import violations.ServiceProduct;
import violations.Product;
import solutions.Shippable;
import solutions.Downloadable;
import solutions.Serviceable;

public class E3_LSP {
    public static void main(String[] args) {
        Product laptop = new PhysicalProduct("Laptop", 1900, 1.6);
        Product ebook = new DigitalProduct("E-book", 20, "www.downloads.com/ebooks/libritos", 5000);
        Product wash = new ServiceProduct("Lavado de Autos", 25, 30);
        
        System.out.println(laptop.getName() + " - Precio: S/ " + laptop.calculatePrice());
        System.out.println(ebook.getName() + " - Precio: S/ " + ebook.calculatePrice());
        System.out.println(wash.getName() + " - Precio: S/ " + wash.calculatePrice());
        
        if (laptop instanceof Shippable ship) {
            System.out.println("Costo de Envio - Laptop: " + ship.calculateShippingCost());
            System.out.println("Requiere entrega fisica?: " + ship.requiresPhysicalDelivery());
        }
        
        if(ebook instanceof Downloadable download){
            System.out.println("Descarga el E-book: " + download.getDownloadUrl());
            System.out.println("Tamano del archivo: " + download.getFileSize() + " KB");
        }
        
        if(wash instanceof Serviceable service) {
            service.scheduleService();
            System.out.println("Duracion: " + service.getServiceDuration() + " min");
 
        }
    }
}
