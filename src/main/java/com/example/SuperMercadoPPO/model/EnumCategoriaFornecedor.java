package com.example.SuperMercadoPPO.model;

public enum EnumCategoriaFornecedor {

    HIGIENE("Higiene"),
    COMIDA("Comida"),
    BEBIDAS("Bebidas"),
    LIMPEZA("Limpeza");

    private String descricao;

    EnumCategoriaFornecedor(String descricao) {
        this.descricao = descricao;
    }
}
