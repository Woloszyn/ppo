package com.example.SuperMercadoPPO.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private int id;
    private Empresa empresa;
    private String cpf;
    private String nome;
    private String cargo;
    private List<Tarefa> listTarefas = new ArrayList<>();

    public Funcionario() {
    }

    public List<Tarefa> getListTarefas() {
        return listTarefas;
    }

    public void setListTarefas(List<Tarefa> listTarefas) {
        this.listTarefas = listTarefas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
