package com.example;

abstract class Veiculo {
    protected String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    abstract void mover();

    public void verCor() {
        System.out.println("A cor do veículo é: " + cor);
    }
}


