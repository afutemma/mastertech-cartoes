package com.mastertech.cartoes.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_CARTAO")
public class Cartao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCartao;
    private String numero;
    private Cliente cliente;
    private boolean ativo;

    public Cartao() {
    }

    public Cartao(int idCartao, String numero, Cliente cliente, boolean ativo) {
        this.idCartao = idCartao;
        this.numero = numero;
        this.cliente = cliente;
        this.ativo = ativo;
    }

    public int getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
