package com.example;

public class Main {
    public static void main(String[] args) {
        Computador notebook = new Notebook();
        Computador desktop = new Desktop();

        notebook.processar();
        desktop.processar();
    }
}