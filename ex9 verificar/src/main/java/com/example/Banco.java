package com.exemple;

abstract class Banco {
    protected double valor;

    public Banco(double valor) {
        this.valor = valor;
    }

    abstract double realizarTransacao();
}