package org.example.services;

import org.example.entities.Usuario;
import org.example.repositories.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
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

    //Criando um Usuario
    public Usuario insert(Usuario usuario){
        return repository.save(usuario);
    }

    //Deletando um Usuario
    public void delete (long id){
        repository.deleteById(id);
    }

    public boolean update (long id, Usuario usuario) {
        Optional<Usuario> optional = repository.findById(id);
            if (optional.isPresent()) {
                Usuario usuario1 = optional.get();
                usuario1.setNomeUsuario(usuario.getNomeUsuario());
                usuario1.setIdade((usuario.getIdade()));
                repository.save(usuario1);
                return true;
            }
            return false;
    }

}
