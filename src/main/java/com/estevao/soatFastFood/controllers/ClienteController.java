package com.estevao.soatFastFood.controllers;

import com.estevao.soatFastFood.dto.ClienteDTO;
import com.estevao.soatFastFood.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<ClienteDTO> insert(@RequestBody ClienteDTO c){
        ClienteDTO dto = service.insert(c);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
