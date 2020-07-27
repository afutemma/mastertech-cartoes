package com.mastertech.cartoes.service;

import com.mastertech.cartoes.dtos.PagamentoDTO;
import com.mastertech.cartoes.models.Cartao;
import com.mastertech.cartoes.models.Pagamento;
import com.mastertech.cartoes.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository repository;
    @Autowired
    CartaoService cartaoService;


    public PagamentoDTO save(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento();
        Cartao cartao = new Cartao();
        Optional<Cartao> optional;
        optional = cartaoService.findById(pagamentoDTO.getCartao_id());
        if (optional.isPresent()) {
            cartao = optional.get();
        } else {
            System.out.print("Cartão não existe");
        }
        pagamento.setValor(pagamentoDTO.getValor());
        pagamento.setIdCartao(pagamentoDTO.getCartao_id());
        pagamento.setDescricao(pagamentoDTO.getDescricao());

        repository.save(pagamento);

        pagamentoDTO.setId(pagamento.getId());

        return pagamentoDTO;
    }

    public List<Pagamento> listar(int idCartao) {

        return repository.findAllByIdCartao(idCartao);
    }
}
