package com.example;
import java.util.ArrayList;
import java.util.List;


public class Prato {
    protected String nome;
    protected double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() {
        return nome + " - R$ " + preco;
    }
}
