package com.example.springjwtPractica.service;

import com.example.springjwtPractica.dto.ContactRequest;
import com.example.springjwtPractica.dto.ContactResponse;
import com.example.springjwtPractica.entity.Contacto;

import java.util.List;

public interface ContactoService {
    List<ContactResponse> findByIdUser(int iduser);
    void save(ContactRequest contactRequest, int id);

    void delete(int id);
}
