package org.example.services;

import org.example.entities.Produto;
import org.example.entities.Produto;
import org.example.repositories.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServiceProduto {
    @Autowired
    private RepositoryProduto repository;

    //Listar todos produtos
    public List<Produto> FindAll() {return repository.findAll();}

    //Listar apenas Um unico produto
    public Optional<Produto> FindById(Long id) {return repository.findById(id);}

    //Criando um Produto
    public Produto insert (Produto produto) { return repository.save(produto);}

    //deletando um produto
    public void delete (long id) {repository.deleteById(id);}

    public boolean update (long id, Produto produto) {
        Optional <Produto> optional = repository.findById(id);
        if (optional.isPresent()) {
            Produto produto1 = optional.get();
            produto1.setNome(produto.getNome());
            repository.save(produto1);
            return true;

        }
        return false;
    }
}
