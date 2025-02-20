package com.example;

public class Deposito extends Banco {
    @Override
    public void realizarTransacao(double valor) {
        if (valor > 0) {
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor para depósito deve ser positivo.");
        }
    }
}