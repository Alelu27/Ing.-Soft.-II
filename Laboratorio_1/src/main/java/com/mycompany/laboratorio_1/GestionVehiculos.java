package com.mycompany.laboratorio_1;

import java.util.ArrayList;
import java.util.List;

public class GestionVehiculos {
   
    public static void main(String[] args) {
        List <Vehiculo> vehiculos = new ArrayList<>(); // Nombre lista: vehiculos
        
        vehiculos.add(new Auto(2, "Automatico", "Aston Martin", "DB11", 2022, 21500.0));
        vehiculos.add(new Motocicleta(321, false, "Yamaha", "R3", 2023, 7500.0));
        vehiculos.add(new Tesla(true, 18.0, 480.0, "Tesla", "M23", 2023, 18500.0));
        
        System.out.println("=== INFORMACION DE VEHICULOS ===");
        for (Vehiculo v : vehiculos) {
            System.out.println("------------------------");
            v.mostrarInfo();
            v.encender();
            System.out.println("Precio: $" + v.getPrecio());
            System.out.println("......................");
            
            if (v instanceof Auto) {
                Auto auto = (Auto) v;
                auto.activarAireAcondicionado();
                
            } else if (v instanceof Motocicleta) {
                Motocicleta motocicleta = (Motocicleta) v;
                motocicleta.hacerCaballito();
                
            } else if (v instanceof Tesla) {
                Tesla tesla = (Tesla) v;
                tesla.modoEcoActivar();
                tesla.calcularEficiencia();
                tesla.activarAutopilot();
            }
        }
    }
}
