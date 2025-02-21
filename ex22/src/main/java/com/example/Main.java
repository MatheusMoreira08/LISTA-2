package com.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contacorrente = new ContaCorrente();
        ContaBancaria contapoupanca = new ContaPoupanca();

        contacorrente.sacar();
        contacorrente.depositar();
        contapoupanca.sacar();
        contapoupanca.depositar();
    }
}