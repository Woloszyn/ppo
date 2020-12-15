package com.example.SuperMercadoPPO.model;

public class Compra {

    private int id;
    private double valorCompra;
    private NotaFiscalEletronica nfe;
    private Empresa empresa;

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public NotaFiscalEletronica getNfe() {
        return nfe;
    }

    public void setNfe(NotaFiscalEletronica nfe) {
        this.nfe = nfe;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
