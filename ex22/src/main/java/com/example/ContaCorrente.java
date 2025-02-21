package com.example;

public abstract class ContaCorrente extends ContaBancaria {

    @Override
    public void sacar() {
        System.out.println("saque realizado...");
    }

    public void deposito() {
        System.out.println("valor depositado....");
    }
}
