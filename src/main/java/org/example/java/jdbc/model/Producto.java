package org.example.java.jdbc.model;

import java.util.Date;

public class Producto {

    private int id;
    private String nombre;
    private int precio;
    private Date fechaRegistro;

    private Cateogoria categoria;


    public Cateogoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Cateogoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria.getNombre() + ", fechaRegistro=" + fechaRegistro + '}';
    }

    public Producto() {
    }

    public Producto(int id, String nombre, int precio, Date fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
