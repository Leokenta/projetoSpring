package org.example.resources;

import org.example.entities.Cliente;
import org.example.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente")
public class ResourceCliente {


    @Autowired
    private ServiceCliente service;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> cliente = service.FindAll();
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id_cliente}")
    public ResponseEntity<Cliente>findAll(@PathVariable Long id) {
        Optional<Cliente>cliente = service.FindById(id);
        return cliente.map(ResponseEntity::ok).orElseGet(()
                -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id_cliente}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
