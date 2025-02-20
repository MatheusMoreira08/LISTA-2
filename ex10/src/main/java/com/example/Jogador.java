package com.example;

public class Jogador extends Personagem {

    @Override
    public void atacar() {
        System.out.println("O jogador esta combando");
    }

    public void usarHabilidade() {
        System.out.println("Ultimate ativada");
    }
}
