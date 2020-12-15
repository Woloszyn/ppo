package com.example.SuperMercadoPPO.model;

public enum EnumSituacaoPedido {

    PEDIDO_ACEITO("Pedido Aceito"),
    PEDIDO_REJEITADO("Pedido Rejeitado"),
    PEDIDO_ENVIADO("Pedido Emviado"),
    PEDIDO_CANCELADO("Pedido Cancelado");

    private String descricao;

    EnumSituacaoPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
