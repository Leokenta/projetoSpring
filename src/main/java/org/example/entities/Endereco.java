package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_endereco",nullable = false)
    private Long id;

    @Column (length = 255,name = "logradouro", nullable = false)
    private String logradouro;

    @Column (length = 255,name = "numero", nullable = false)
    private String numero;

    @Column (length = 255,name = "complemento", nullable = false)
    private String complemento;

    @Column (length = 255,name = "bairro", nullable = false)
    private String bairro;

    @Column (length = 255,name = "cidade", nullable = false)
    private String cidade;

    @Column (length = 255,name = "estado", nullable = false)
    private String estado;

    @Column (length = 55,name = "cep", nullable = false)
    private String cep;

    public Endereco() {
    }


    public Endereco(Long id, String logradouro, String numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
