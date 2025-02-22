package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario desenvolvedor = new Desenvolvedor();
        Funcionario designer = new Designer();

        desenvolvedor.baterPonto();
        designer.baterPonto();
    }
}