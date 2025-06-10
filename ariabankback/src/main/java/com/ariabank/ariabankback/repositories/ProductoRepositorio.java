package com.ariabank.ariabankback.repositories;


import com.ariabank.ariabankback.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
