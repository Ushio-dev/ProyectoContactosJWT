package com.example.springjwtPractica.repository;

import com.example.springjwtPractica.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    List<Contacto> findByIduser(int iduser);
}
