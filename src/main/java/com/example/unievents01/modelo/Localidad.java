package com.example.unievents01.modelo;

import java.io.Serializable;

public class Localidad implements Serializable {

    private int numeroLocalidad;
    private double precio;
    private int capacidadMaxima;


    public Localidad(int numeroLocalidad, double precio, int capacidadMaxima) {
        this.numeroLocalidad = numeroLocalidad;
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getNumeroLocalidad() {
        return numeroLocalidad;
    }

    public void setNumeroLocalidad(int numeroLocalidad) {
        this.numeroLocalidad = numeroLocalidad;
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
                "numeroLocalidad=" + numeroLocalidad +
                ", precio=" + precio +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}
