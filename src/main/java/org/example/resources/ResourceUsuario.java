package org.example.resources;

import org.example.entities.Usuario;
import org.example.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuarios")
public class ResourceUsuario {

    @Autowired
    private ServiceUsuario service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> usuario = service.findAll();
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findByAll(@PathVariable Long id) {
        Optional<Usuario> usuario = service.findById(id);
        return usuario.map(ResponseEntity::ok).orElseGet(()
                -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
