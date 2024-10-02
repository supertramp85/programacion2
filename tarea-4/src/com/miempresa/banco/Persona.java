package com.miempresa.banco;

public class Persona {
    private String nombre;
    private String apellido;
    private String documento;
    private String provincia;
    private String ciudad;

    public Persona(String nombre, String apellido, String documento, String provincia, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }
}

