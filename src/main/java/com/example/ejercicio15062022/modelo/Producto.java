package com.example.ejercicio15062022.modelo;

public class Producto {
    private String cod;
    private String nombre;
    private int precio;


    public Producto() {
    }

    public Producto(String cod, String nombre, int precio) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
