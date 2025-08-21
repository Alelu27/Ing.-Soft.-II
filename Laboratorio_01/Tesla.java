package com.mycompany.laboratorio_1;

public class Tesla extends VehiculoElectrico {
   private boolean autopilot;

    public Tesla(boolean autopilot, double capacidadBateria, double autonomia, String marca, String modelo, int año, double precio) {
        super(capacidadBateria, autonomia, marca, modelo, año, precio);
        this.autopilot = autopilot;
    }
    
    @Override
    public void modoEcoActivar() {
        System.out.println("Modo Eco Activado !!!");
    }
    
    @Override
    public double calcularEficiencia() {
       double eficiencia = this.autonomia / this.capacidadBateria;
       System.out.println("La eficiencia del Tesla es: " + String.format("%.2f", eficiencia) + " km/kWh.");
       return eficiencia;
    }
    
    public void activarAutopilot() {
        if (this.autopilot) {
            System.out.println("Autopilot ACTIVADO !!!");
        } else {
            System.out.println("Autopilot DESACTIVADO !!!");
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tiene Autopilot: " + (this.autopilot ? "Si" : "No"));
    } 
}
