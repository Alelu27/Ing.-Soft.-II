package com.mycompany.laboratorio_1;

public class Motocicleta extends Vehiculo {
  private int cilindrada;
  private boolean tieneSidecar;

    public Motocicleta(int cilindrada, boolean tieneSidecar, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }  
    
    public void hacerCaballito() {
        if (this.tieneSidecar == false) {
            System.out.println("Haciendo Caballito :)");
        } else {
            System.out.println("No se puede hacer caballito :(");
        }
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fue HEREDADO!");
        System.out.println("Cantidad de Cilindros: " + this.cilindrada);
        System.out.println("Tiene Sidecar: " + (this.tieneSidecar ? "Si" : "No"));
    }
}
