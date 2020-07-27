package com.mastertech.cartoes.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_CLIENTE")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;
    private String nome;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCLiente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
