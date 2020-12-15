package com.example.SuperMercadoPPO.model;

public class NotaFiscalEletronica {

    private int id;
    private boolean isEmitido;

    public NotaFiscalEletronica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmitido() {
        return isEmitido;
    }

    public void setEmitido(boolean emitido) {
        isEmitido = emitido;
    }
}
