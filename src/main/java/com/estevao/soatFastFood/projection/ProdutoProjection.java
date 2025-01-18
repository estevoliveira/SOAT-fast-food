package com.estevao.soatFastFood.projection;

public interface ProdutoProjection {
    Long getId();
    String getNome();
    String getDescricao();
    Double getPreco();
    String getImagem();

    //Integer getCategoria();
}
