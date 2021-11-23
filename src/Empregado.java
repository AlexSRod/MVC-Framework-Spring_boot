package com.fatecrl.mvcdemo.models;

public class Empregado {
    private String nome;
    private String cargo;
    private String email;
    private String endereco;

    public Empregado(String s) {
    }

    public Empregado(String nome, String cargo, String email, String endereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
