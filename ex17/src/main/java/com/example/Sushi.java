package com.example;
import java.util.ArrayList;
import java.util.List;

class Sushi extends Prato {
    private int quantidade;

    public Sushi(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " (" + quantidade + " peças)";
    }
}