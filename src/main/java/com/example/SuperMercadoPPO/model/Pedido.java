package com.example.SuperMercadoPPO.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ObserverCliente> observerCliente = new ArrayList<ObserverCliente>();
    private int id;
    private Compra caixa;
    private EnumSituacaoPedido situacao;
    private List<Produto> produtos;

    public Pedido(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Pedido addObserverCliente(ObserverCliente cliente) {
        this.observerCliente.add(cliente);
        return this;
    }

    public void removeAllObserverCliente() {
        this.observerCliente.clear();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Compra getCaixa() {
        return caixa;
    }

    public void setCaixa(Compra caixa) {
        this.caixa = caixa;
    }

    public EnumSituacaoPedido getSituacao() {
        return situacao;
    }

    public void setSituacao(EnumSituacaoPedido situacao) {
        this.situacao = situacao;
        this.notifyObservers();
    }

    private void notifyObservers() {
        for (ObserverCliente cliente : this.observerCliente) {
            cliente.recebePedido(this);
        }
    }
}
