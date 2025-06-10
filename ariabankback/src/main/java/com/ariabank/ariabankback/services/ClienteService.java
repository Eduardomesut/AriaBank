package com.ariabank.ariabankback.services;

import com.ariabank.ariabankback.entities.Cliente;
import com.ariabank.ariabankback.repositories.ClienteRepository;
import com.ariabank.ariabankback.services.base.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService extends BaseService<Cliente, Long, ClienteRepository> {


}
