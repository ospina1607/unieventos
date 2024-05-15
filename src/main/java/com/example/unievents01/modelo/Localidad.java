package com.example.unievents01.modelo;

import java.io.Serializable;

public class Localidad implements Serializable {

    private double precio;
    private int capacidadMaxima;


    public Localidad(double precio, int capacidadMaxima) {
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "precio=" + precio +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }



}
