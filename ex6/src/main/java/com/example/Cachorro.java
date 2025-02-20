package com.example;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }


    @Override
    void fazerSom() {
        System.out.println(getNome() + "Dog latindo");
    }
}
