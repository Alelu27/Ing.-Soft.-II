package com.mycompany.laboratorio_1;

public class Auto extends Vehiculo {
    private int numeroPuertas;
    private String tipoTransmision;

    public Auto(int numeroPuertas, String tipoTransmision, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }  
    
    public void activarAireAcondicionado() {
        System.out.println("Aire Acondicionado Activado");
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Esto fue HEREDADO!");
        System.out.println("Numero de Puertas: " + this.numeroPuertas);
        System.out.println("Tipo de Transmision: " + this.tipoTransmision);
    }
}
