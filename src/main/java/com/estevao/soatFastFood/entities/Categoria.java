package com.estevao.soatFastFood.entities;

import com.estevao.soatFastFood.dto.ProdutoDTO;

import java.util.List;

public enum Categoria {
    LANCHE(1),
    ACOMPANHAMENTO(2),
    BEBIDA(3),
    SOBREMESA(4);

    private Integer valor;

    Categoria(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
