package com.example.springjwtPractica.security.repository;

import com.example.springjwtPractica.security.entity.Rol;
import com.example.springjwtPractica.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
