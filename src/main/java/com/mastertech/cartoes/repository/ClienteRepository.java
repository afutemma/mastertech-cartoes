package com.mastertech.cartoes.repository;

import com.mastertech.cartoes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
