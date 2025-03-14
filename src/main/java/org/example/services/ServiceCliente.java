package org.example.services;

import org.example.entities.Cliente;
import org.example.repositories.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceCliente {

    @Autowired
    private RepositoryCliente repository;

    //Listar todos clientes
    public List<Cliente>FindAll() {return repository.findAll();}

    //Listar apenas Um unico cliente
    public Optional<Cliente>FindById(Long id) {return repository.findById(id);}

    //Criando um Cliente
    public Cliente insert (Cliente cliente) { return repository.save(cliente);}

    //deletando um cliente
    public void delete (long id) {repository.deleteById(id);}

    public boolean update (long id, Cliente cliente) {
        Optional <Cliente> optional = repository.findById(id);
            if (optional.isPresent()) {
                Cliente cliente1 = optional.get();
                cliente1.setNomeCliente(cliente.getNomeCliente());
                cliente1.setCpf(cliente.getCpf());
                cliente1.setDataNascimento(cliente.getDataNascimento());
                cliente1.setFormaDePagamento(cliente.getFormaDePagamento());
                repository.save(cliente1);
                return true;

            }
             return false;
    }

}
