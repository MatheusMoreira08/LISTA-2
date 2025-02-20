package com.example;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    void fazerSom() {
        System.out.println(getNome() + "O gato mia");
    }
}
