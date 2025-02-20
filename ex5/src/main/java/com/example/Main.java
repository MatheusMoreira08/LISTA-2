package com.example;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        cachorro.fazerSom();
        gato.fazerSom();
    }
}