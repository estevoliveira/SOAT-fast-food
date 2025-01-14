package com.estevao.soatFastFood.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_produto")
public class PedidoItem {

    @EmbeddedId
    private PedidoItemPK pk = new PedidoItemPK();
    private Double preco;
    private Integer qtde;

    public PedidoItem(Pedido p,Produto pro, Double preco, Integer qtde) {
        this.pk.setPedido(p);
        this.pk.setProdruto(pro);
        this.preco = preco;
        this.qtde = qtde;
    }

    public PedidoItem() {
    }

    public Pedido getPedido(){
        return this.pk.getPedido();
    }
    public void setPedido(Pedido p){
        this.pk.setPedido(p);
    }
    public Produto getProduto(){
        return this.pk.getProdruto();
    }
    public void setProduto(Produto pro){
        this.pk.setProdruto(pro);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
}
