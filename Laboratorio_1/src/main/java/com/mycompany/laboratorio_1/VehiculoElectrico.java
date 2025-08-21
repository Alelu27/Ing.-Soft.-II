package com.mycompany.laboratorio_1;

public abstract class VehiculoElectrico extends Vehiculo {
    protected double capacidadBateria; // kWh
    protected double autonomia; // km

    public VehiculoElectrico(double capacidadBateria, double autonomia, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    
    public void cargarBatería() {
        System.out.println("Cargando la bateria...");
    }
    
    public abstract void modoEcoActivar();
    
    public abstract double calcularEficiencia();

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Bateria: " + this.capacidadBateria + " kWh");
        System.out.println("Autonomia Estimada: " + this.autonomia + " km");
    }  
}
