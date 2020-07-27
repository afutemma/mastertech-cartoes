package com.mastertech.cartoes.service;

import com.mastertech.cartoes.dtos.CartaoDTO;
import com.mastertech.cartoes.models.Cartao;
import com.mastertech.cartoes.models.Cliente;
import com.mastertech.cartoes.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository repository;
    @Autowired
    private ClienteService clienteService;

    public Optional<Cartao> findById(int id){
        return repository.findById(id);
    }


    public CartaoDTO findByNumero(String numero){
        List<Cartao> c = repository.findByNumero(numero);
        Cartao cartao = c.get(0);
        CartaoDTO dto = new CartaoDTO();
        dto.setIdCartao(cartao.getIdCartao());
        dto.setAtivo(cartao.isAtivo());
        dto.setClienteId(cartao.getCliente().getIdCliente());
        dto.setNumero(cartao.getNumero());

        return dto;
    }

    public CartaoDTO save(CartaoDTO cadastro){
        Cartao cartao = new Cartao();
        Cliente cliente = new Cliente();
        Optional<Cliente> optional;
        optional = clienteService.findById(cadastro.getClienteId());
        if(optional.isPresent()) {
            cliente = optional.get();
        } else {
            System.out.print("Cliente não existe");
        }
        cartao.setNumero(cadastro.getNumero());
        cartao.setCliente(cliente);
        cartao.setAtivo(false);

        repository.save(cartao);

        cadastro.setIdCartao(cartao.getIdCartao());

        return cadastro;
    }

    public List<Cartao> findAll() {
        return repository.findAll();
    }

    public CartaoDTO ativar(String numero){
        List<Cartao> c = repository.findByNumero(numero);
        Cartao cartao = c.get(0);
        cartao.setAtivo(true);
        repository.save(cartao);
        CartaoDTO dto = new CartaoDTO();
        dto.setIdCartao(cartao.getIdCartao());
        dto.setAtivo(cartao.isAtivo());
        dto.setClienteId(cartao.getCliente().getIdCliente());
        dto.setNumero(cartao.getNumero());

        return dto;
    }
}
