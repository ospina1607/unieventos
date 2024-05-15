package com.example.unievents01.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private String nombre;
    private List<Evento> listaEventos=new ArrayList<>();

    public Empresa(String nombre, List<Evento> listaEventos) {
        this.nombre = nombre;
        this.listaEventos = listaEventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(List<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", listaEventos=" + listaEventos +
                '}';
    }
}
