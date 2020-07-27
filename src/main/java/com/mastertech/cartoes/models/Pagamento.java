package com.mastertech.cartoes.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_PAGAMENTO")
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Cartao cartao;
    private double valor;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setIdPagamento(int id) {
        this.id = id;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
