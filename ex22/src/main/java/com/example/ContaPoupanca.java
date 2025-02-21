package com.example;

public abstract class ContaPoupanca extends ContaBancaria {

    @Override
    public void sacar() {
        System.out.println("saque realizado..");
    }

    public void depositar() {
        System.out.println("deposito realizado...");
    }

}
