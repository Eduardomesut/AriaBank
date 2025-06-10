package com.ariabank.ariabankback.repositories;

import com.ariabank.ariabankback.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//Asi realizo filtros complejos
public interface ClienteRepository extends JpaRepository<Cliente, Long>,
        JpaSpecificationExecutor<Cliente> {



}
