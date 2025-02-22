package com.example;

public class Main {
    public static void main(String[] args) {
        Estoque eletronicos = new Eletronicos();
        Estoque roupas = new Roupas();

        eletronicos.atualizarQuantidade();
        roupas.atualizarQuantidade();
    }
}