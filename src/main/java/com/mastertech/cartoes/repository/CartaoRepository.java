package com.mastertech.cartoes.repository;

import com.mastertech.cartoes.models.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartaoRepository extends JpaRepository<Cartao, Integer> {

    List<Cartao> findByNumero(String numero);
}
