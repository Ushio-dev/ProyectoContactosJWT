package com.example.springjwtPractica.dto;

import com.example.springjwtPractica.entity.Contacto;

public class ContactResponse {
    private int id;
    private String nombre;
    private Long numeroTelefonico;

    public ContactResponse() {
    }

    public ContactResponse(Contacto contacto) {
        this.id = contacto.getId();
        this.nombre = contacto.getNombre();
        this.numeroTelefonico = contacto.getNumeroTelefono();
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

    public Long getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(Long numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
}
