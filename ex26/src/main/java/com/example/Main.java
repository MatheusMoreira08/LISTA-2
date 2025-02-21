package com.example;

public class Main {
    public static void main(String[] args) {
        Trabalho professor = new Professor();
        Trabalho engenheiro = new Engenheiro();

        professor.executar();
        engenheiro.executar();
    }
}