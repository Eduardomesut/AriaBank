package com.ariabank.ariabankback.services;


import com.ariabank.ariabankback.entities.Categoria;
import com.ariabank.ariabankback.repositories.CategoriaRepositorio;
import com.ariabank.ariabankback.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio extends BaseService<Categoria, Long, CategoriaRepositorio> {

}
