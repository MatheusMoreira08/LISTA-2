package com.example;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical piano = new Piano();

        guitarra.tocar();
        piano.tocar();
    }
}