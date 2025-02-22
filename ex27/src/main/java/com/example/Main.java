package com.example;

public class Main {
    public static void main(String[] args) {
        Produto eletronico = new Eletronico();
        Produto alimento = new Alimento();

        eletronico.calculardesconto();
        alimento.calculardesconto();
    }
}