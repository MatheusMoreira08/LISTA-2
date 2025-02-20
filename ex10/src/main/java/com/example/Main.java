package com.example;

public class Main {
    public static void main(String[] args) {

        Personagem guerreiro = new Guerreiro();
        Personagem mago = new Mago();
        Jogador jogador = new Jogador();
        
        guerreiro.atacar();
        mago.atacar();
        jogador.atacar();
        
        
        jogador.usarHabilidade();
    }
}