package org.example.services;

import org.example.entities.Usuario;
import org.example.repositories.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ServiceUsuario {

    @Autowired
    private RepositoryUsuario repository;


    //Listar Todos Usuarios
    public List<Usuario> findAll(){
        return repository.findAll();
    }

    //Listar um unico usuário por ID
    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

}
