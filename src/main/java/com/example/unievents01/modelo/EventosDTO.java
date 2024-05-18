package com.example.unievents01.modelo;

public class EventosDTO {

    private String nombre;
    private Ciudad ciudad;
    private Tipo tipo;
    private String fecha;
    private String direccion;

    public EventosDTO(String nombre, Ciudad ciudad, Tipo tipo, String fecha, String direccion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.fecha = fecha;
        this.direccion = direccion;
    }
}
