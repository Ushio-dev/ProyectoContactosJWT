package com.example.springjwtPractica.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int iduser;
    private Long numeroTelefono;

    public Contacto() {
    }

    public Contacto(String nombre, int iduser, Long numeroTelefono) {
        this.nombre = nombre;
        this.iduser = iduser;
        this.numeroTelefono = numeroTelefono;
    }

    public Contacto(int id, String nombre, int id_user, Long numeroTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.iduser = id_user;
        this.numeroTelefono = numeroTelefono;
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

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public Long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
