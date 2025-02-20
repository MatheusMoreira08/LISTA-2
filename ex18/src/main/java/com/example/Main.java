package com.example;

public class Main {
    public static void main(String[] args) {
        Jogo jogoAventura = new JogoAventura();
        Jogo jogoCorrida = new JogoCorrida();

        jogoAventura.iniciar();
        jogoCorrida.iniciar();
    }
}