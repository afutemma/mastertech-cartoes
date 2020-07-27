package com.mastertech.cartoes.dtos;

import com.mastertech.cartoes.models.Cartao;
import com.mastertech.cartoes.models.Cliente;

import java.io.Serializable;


public class CartaoDTO implements Serializable {

    private int idCartao;
    private String numero;
    private int clienteId;
    private boolean ativo;

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

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
