package com.mycompany.laboratorio_1;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + "marca = " + marca + ", modelo = " + modelo + ", anio = " + año + ", precio = "  + precio);
    }
    
    public void encender() {
        System.out.println("Vehiculo esta encendido!!!");
    }
}
