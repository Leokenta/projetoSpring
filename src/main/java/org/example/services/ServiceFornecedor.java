package org.example.services;

import org.example.entities.Fornecedor;
import org.example.entities.Fornecedor;
import org.example.repositories.RepositoryFornecedor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceFornecedor {
    @Autowired
    private RepositoryFornecedor repository;

    //Listar todos fornecedors
    public List<Fornecedor> FindAll() {return repository.findAll();}

    //Listar apenas Um unico fornecedor
    public Optional<Fornecedor> FindById(Long id) {return repository.findById(id);}

    //Criando um Fornecedor
    public Fornecedor insert (Fornecedor fornecedor) { return repository.save(fornecedor);}

    //deletando um fornecedor
    public void delete (long id) {repository.deleteById(id);}

    public boolean update (long id, Fornecedor fornecedor) {
        Optional <Fornecedor> optional = repository.findById(id);
        if (optional.isPresent()) {
            Fornecedor fornecedor1 = optional.get();
            fornecedor1.setNome(fornecedor.getNome());
            repository.save(fornecedor1);
            return true;

        }
        return false;
    }
    
}
