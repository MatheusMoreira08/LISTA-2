package com.example;

public class Carro extends Veiculo {
    public Carro(String cor) {
        super(cor);
    }

    @Override
    void mover() {
        System.out.println("O carro ligou e esta se movendo");
    }
}
