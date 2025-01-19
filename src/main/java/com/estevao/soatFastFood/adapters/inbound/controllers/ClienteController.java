package com.estevao.soatFastFood.adapters.inbound.controllers;

import com.estevao.soatFastFood.domain.dto.ClienteDTO;
import com.estevao.soatFastFood.application.services.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/clientes")
@Tag(name = "Cliente", description = "Class controller para o cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @Operation(
            description = "Cadastrar um novo cliente",
            summary = "Castrar cliente",
            responses = {
                    @ApiResponse(description = "Cadastrar", responseCode = "201")
            }
    )
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
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
