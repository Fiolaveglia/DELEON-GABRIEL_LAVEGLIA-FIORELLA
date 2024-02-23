package com.backend.entity;

public class Odontologo {

    private int id;
    private int numeroMatricula;
    private String Nombre;
    private String Apellido;

    public Odontologo(int id, int numeroMatricula, String nombre, String apellido) {
        this.id = id;
        this.numeroMatricula = numeroMatricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Odontologo(int numeroMatricula, String nombre, String apellido) {
        this.numeroMatricula = numeroMatricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", numeroMatricula=" + numeroMatricula +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido;
    }
}

