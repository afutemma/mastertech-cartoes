package com.mastertech.cartoes.controller;


import com.mastertech.cartoes.models.Cliente;
import com.mastertech.cartoes.repository.ClienteRepository;
import com.mastertech.cartoes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/cliente")
    public ResponseEntity postCliente(@RequestBody Cliente cliente){
        service.save(cliente);
        return ResponseEntity.ok(service.save(cliente));
    }

    @GetMapping("/cliente/{id}")
    public Optional<Cliente> getCliente(@PathVariable String id){
        return service.findById(Integer.valueOf(id));
    }
    @GetMapping("/clientes")
    public List<Cliente> getAllClientes() {
        return service.findAll();
    }
}
