package com.estevao.soatFastFood.projection;

import com.estevao.soatFastFood.entities.Categoria;

public interface ProdutoProjection {
    Long getId();
    String getNome();
    String getDescricao();
    String getImagem();
    Double getPreco();
    Integer getCategoria();
}
