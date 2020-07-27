package com.mastertech.cartoes.controller;

import com.mastertech.cartoes.dtos.CartaoDTO;
import com.mastertech.cartoes.dtos.PagamentoDTO;
import com.mastertech.cartoes.models.Cliente;
import com.mastertech.cartoes.models.Pagamento;
import com.mastertech.cartoes.repository.PagamentoRepository;
import com.mastertech.cartoes.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PagamentoController {


    @Autowired
    PagamentoService service;

    @PostMapping("/pagamento")
    public ResponseEntity postCartao(@RequestBody PagamentoDTO pagamento) {
        return ResponseEntity.ok(service.save(pagamento));
    }


    @GetMapping("/pagamentos/{id_cartao}")
    public List<Pagamento> consultarPagamentos(@PathVariable int id_cartao){
        List<Pagamento> pgts = service.listar(id_cartao);
        return pgts;
    }

}
