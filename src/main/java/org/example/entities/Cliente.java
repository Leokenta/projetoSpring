package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_cliente",nullable = false)
    private Long id;

    @Column (length = 255,name = "nomeCliente",nullable = false)
    private String nomeCliente;

    @Column (length = 255, name = "cpf",nullable = false)
    private String cpf;

    @Column (length = 255,name = "dataNascimento",nullable = false)
    private String dataNascimento;

    @Column (length = 255, name = "formaDePagamento",nullable = false)
    private String formaDePagamento;


    public Cliente() {
    }


    public Cliente(Long id, String nomeCliente, String cpf, String dataNascimento, String formaDePagamento) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.formaDePagamento = formaDePagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
//id (Long)
//nome (String)
//cpfCnpj (String)
//dataNascimento (LocalDate)
//formaPagamento (String)