package com.example;

public class Main {
    public static void main(String[] args) {
        Aula matematica = new Matematica();
        Aula portugues = new Portugues();

        matematica.ministrar();
        portugues.ministrar();
    }
}