package com.example.springjwtPractica.controller;

import com.example.springjwtPractica.dto.ContactRequest;
import com.example.springjwtPractica.dto.ContactResponse;
import com.example.springjwtPractica.entity.Contacto;
import com.example.springjwtPractica.security.entity.Usuario;
import com.example.springjwtPractica.security.service.UsuarioService;
import com.example.springjwtPractica.service.ContactoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ContactoController {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ContactoService contactoService;

    @GetMapping
    public ResponseEntity<List<ContactResponse>> contactos(Authentication authentication) {
        int id = usuarioService.traerId(authentication.getName());
        List<ContactResponse> contactos = contactoService.findByIdUser(id);

        if (contactos.isEmpty())
            return ResponseEntity.notFound().build();

        return new ResponseEntity(contactos, HttpStatus.OK);
    }

    // estos metodos deberian de devolver el token
    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevoContacto(@RequestBody ContactRequest contactRequest, Authentication authentication) {
        int id = usuarioService.traerId(authentication.getName());
        contactoService.save(contactRequest, id);
        return  new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable int id) {
        contactoService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
