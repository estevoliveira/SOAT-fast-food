package com.estevao.soatFastFood.domain.dto;

import com.estevao.soatFastFood.domain.entities.Categoria;

public class CategoriaDTO {

    private Long id;
    private String nome;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Categoria c) {
        this.id = c.getId();
        this.nome = c.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
