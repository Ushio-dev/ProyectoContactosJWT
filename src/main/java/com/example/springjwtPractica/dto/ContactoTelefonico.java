package com.example.springjwtPractica.dto;

public class ContactoTelefonico {
    private String nombre;
    private Long numeroTelefonico;

    public ContactoTelefonico() {
    }

    public ContactoTelefonico(String nombre, Long numeroTelefonico) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(Long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
}
