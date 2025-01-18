package com.estevao.soatFastFood.services;

import com.estevao.soatFastFood.dto.ClienteDTO;
import com.estevao.soatFastFood.entities.Cliente;
import com.estevao.soatFastFood.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    public ClienteDTO insert(ClienteDTO dto){
        Cliente c = new Cliente();
        c.setNome(dto.getNome());
        c.setCpf(dto.getCpf());
        c.setEmail(dto.getEmail());
        c = repository.save(c);
        return new ClienteDTO(c);
    }

}
