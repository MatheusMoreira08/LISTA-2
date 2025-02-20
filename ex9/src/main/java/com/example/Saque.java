package com.example;

public class Saque extends Banco {
    @Override
    public void realizarTransacao(double valor) {
        if (valor > 0) {
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor para saque deve ser positivo.");
        }
    }
}