package com.example.SuperMercadoPPO.model;

public class Fornecedor {

    private int id;
    private String nomeEmpresa;
    private String cnpj;
    private EnumCategoriaFornecedor categoria;

    public Fornecedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public EnumCategoriaFornecedor getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoriaFornecedor categoria) {
        this.categoria = categoria;
    }
}
