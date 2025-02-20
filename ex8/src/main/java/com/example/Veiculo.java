package com.example;

abstract class Veiculo {
    abstract void mover();
    protected String cor();

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public void verCor() {
        System.out.println("A cor e:" + cor);
    } 


}


