package com.example;
import java.util.ArrayList;
import java.util.List;

class Pizza extends Prato {
    private String tamanho;

    public Pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " (Tamanho: " + tamanho + ")";
    }
}