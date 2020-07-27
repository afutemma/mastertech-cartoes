package com.mastertech.cartoes.controller;

import com.mastertech.cartoes.dtos.CartaoDTO;
import com.mastertech.cartoes.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartaoController {

    @Autowired
    private CartaoService service;

    @PostMapping("/cartao")
    public ResponseEntity postCartao(@RequestBody CartaoDTO cartao) {
        return ResponseEntity.ok(service.save(cartao));
    }


    @GetMapping("/cartao/{numero}")
    public ResponseEntity getCartao(@PathVariable String numero) {
        return ResponseEntity.ok(service.findByNumero(numero));
    }


    @PatchMapping("/cartao/{numero}")
    public ResponseEntity ativar(@PathVariable String numero) {
        return ResponseEntity.ok(service.ativar(numero));
    }

}
