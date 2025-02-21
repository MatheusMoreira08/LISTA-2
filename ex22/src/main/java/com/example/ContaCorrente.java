package com.example;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void sacar() {
        System.out.println("saque realizado...");
    }

    @Override
    public void depositar() {
        System.out.println("valor depositado....");
    }
}
