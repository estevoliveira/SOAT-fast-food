package com.estevao.soatFastFood.domain.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_produto")
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Double preco;
    @Column(columnDefinition = "TEXT")
    private String imagem;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    //private Categoria categoria;

    @OneToMany(mappedBy = "pk.produto")
    private Set<PedidoItem> items = new HashSet<>();

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double preco, String imagem, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.categoria = categoria;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Set<PedidoItem> getItems() {
        return items;
    }
    public List<Pedido> getOrders() {
        return items.stream().map(PedidoItem::getPedido).toList();
    }
}
