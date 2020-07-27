package com.mastertech.cartoes.repository;

import com.mastertech.cartoes.models.Cartao;
import com.mastertech.cartoes.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    List<Pagamento> findByCartao(Cartao cartao);
}
