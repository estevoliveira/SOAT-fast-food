package com.estevao.soatFastFood.entities;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Status status;
    private Boolean pagamento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "pk.pedido")
    private Set<PedidoItem> items = new HashSet<>();

    public Pedido(Status status, Cliente cliente, List<Produto> produtos) {
        this.status = status;
        this.cliente = cliente;
        this.pagamento = false;
     //   this.produtos = produtos;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<PedidoItem> getItems() {
        return items;
    }
    public List<Produto> getProducts() {
        return items.stream().map(PedidoItem::getProduto).toList();
    }
}
