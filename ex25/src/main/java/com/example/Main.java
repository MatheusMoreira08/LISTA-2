package com.example;

public class Main {
    public static void main(String[] args) {
        Livro ebook = new Ebook();
        Livro livrofisico = new LivroFisico();

        ebook.abrir();
        livrofisico.abrir();
    }
}