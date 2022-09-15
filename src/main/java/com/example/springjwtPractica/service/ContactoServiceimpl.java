package com.example.springjwtPractica.service;

import com.example.springjwtPractica.dto.ContactRequest;
import com.example.springjwtPractica.dto.ContactResponse;
import com.example.springjwtPractica.entity.Contacto;
import com.example.springjwtPractica.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ContactoServiceimpl implements ContactoService{
    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public List<ContactResponse> findByIdUser(int iduser) {
        List<Contacto> contactos = contactoRepository.findByIduser(iduser);
        List<ContactResponse> responses = contactos.stream().map(ContactResponse::new).collect(Collectors.toList());
        return responses;
    }

    @Override
    public void save(ContactRequest contactRequest, int id) {
        Contacto contacto = new Contacto(contactRequest.getNombre(),id, contactRequest.getNumeroTelefonico());
        contactoRepository.save(contacto);
    }

    @Override
    public void delete(int id) {
        contactoRepository.deleteById(id);
    }
}
