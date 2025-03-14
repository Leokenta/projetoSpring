package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaDePagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_formaDePagamento",nullable = false)
    private Long id;

    @Column (length = 255,name = "tipo",nullable = false)
    private String tipo;

    @Column (length = 255, name = "Descricao")
    private String descricao;


    public FormaDePagamento() {
    }

    public FormaDePagamento(Long id, String tipo, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
