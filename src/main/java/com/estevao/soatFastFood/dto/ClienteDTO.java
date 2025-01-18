package com.estevao.soatFastFood.dto;

import com.estevao.soatFastFood.entities.Cliente;

public class ClienteDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente c) {
        this.id = c.getId();
        this.nome = c.getNome();
        this.email = c.getEmail();
        this.cpf = c.getCpf();
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
