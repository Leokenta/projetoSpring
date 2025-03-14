package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario",nullable = false)
    private Long id;

    @Column(length = 55,name = "nome_usuario", nullable = false)
    private String nomeUsuario;

    @Column(name = "idade_usuario",nullable = false)
    private Integer idade;


    public Usuario() {
    }

    public Usuario(Long id, String nomeUsuario, Integer idade) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
