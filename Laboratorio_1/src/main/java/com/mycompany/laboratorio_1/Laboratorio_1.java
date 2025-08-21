package com.mycompany.laboratorio_1;

public class Laboratorio_1 {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Gestion Vehicular ---");
        
        System.out.println("> Vehiculo <");
        Vehiculo v1 = new Vehiculo ("Toyota", "4Runner", 2020, 15000.0);
        v1.mostrarInfo();
        v1.encender();
        
        System.out.println("==========================");
        
        System.out.println("> Auto <");
        Auto a1 = new Auto (2, "Automatico", "Aston Martin", "DB11", 2022, 21500.0);
        a1.mostrarInfo();
        a1.activarAireAcondicionado();
        
        System.out.println("==========================");
        
        System.out.println("> Motocicleta <");
        Motocicleta m1 = new Motocicleta (321, false, "Yamaha", "R3", 2023, 7500.0);
        m1.mostrarInfo();
        m1.hacerCaballito();      
        
        System.out.println("==========================");
        
        System.out.println("> Tesla <");
        Tesla t1 = new Tesla(true, 18.0, 480.0, "Tesla", "M23", 2023, 18500.0);
        t1.mostrarInfo();
        t1.modoEcoActivar();
        t1.calcularEficiencia();
        t1.activarAutopilot();
        
        System.out.println("==========================");
        
        System.out.println("> Vehiculo Electrico <");
        VehiculoElectrico ve1 = new Tesla(true, 72.0, 430.0, "Tesla", "M25", 2022, 19500.0);
        ve1.mostrarInfo();
        ve1.cargarBatería();
        ve1.modoEcoActivar();
        ve1.calcularEficiencia();
    }
}
