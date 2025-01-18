package com.estevao.soatFastFood.dto;

import com.estevao.soatFastFood.entities.Categoria;

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
