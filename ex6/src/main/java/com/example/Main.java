package com.example;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato("Simas ");
        Animal cachorro = new Cachorro("Thor ");

        cachorro.fazerSom();
        gato.fazerSom();
    }
}