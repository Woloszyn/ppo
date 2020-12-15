package com.example.SuperMercadoPPO.model;

public class Tarefa {

    private int id;
    private Funcionario funcionario;
    private String descricao;
    private String tempo;
    private boolean isFeito;

    public Tarefa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public boolean isFeito() {
        return isFeito;
    }

    public void setFeito(boolean feito) {
        isFeito = feito;
    }
}
