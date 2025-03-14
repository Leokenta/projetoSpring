package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_contato",nullable = false)
    private Long id;

    @Column (length = 255,name = "telefone",nullable = false)
    private String telefone;


    @Column (length = 255,name = "celular",nullable = false)
    private String celular;

    @Column (length = 255,name = "email",nullable = false)
    private String email;


    public Contato() {
    }

    public Contato(Long id, String telefone, String celular, String email) {
        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
