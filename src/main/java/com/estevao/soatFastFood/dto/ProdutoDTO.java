package com.estevao.soatFastFood.dto;

import com.estevao.soatFastFood.entities.Categoria;
import com.estevao.soatFastFood.entities.Produto;
import com.estevao.soatFastFood.projection.ProdutoProjection;
import jakarta.persistence.Column;

public class ProdutoDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String imagem;
    private Categoria categoria;

    public ProdutoDTO(Produto p) {
        this.nome = p.getNome();
        this.descricao = p.getDescricao();
        this.preco = p.getPreco();
        this.imagem = p.getImagem();
        this.categoria = p.getCategoria();
        this.id = p.getId();
    }

    public ProdutoDTO(ProdutoProjection projection) {
        this.id = projection.getId();
        this.nome = projection.getNome();
        this.descricao = projection.getDescricao();
        this.preco = projection.getPreco();
        this.imagem = projection.getImagem();
        //this.categoria = projection.getCategoria();
    }

    public ProdutoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Long getId() {
        return id;
    }
}
