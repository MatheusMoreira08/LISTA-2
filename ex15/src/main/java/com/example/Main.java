package com.example;

public class Main {
    public static void main(String[] args) {
        Documento pdf = new Pdf();
        Documento word = new Word();

        pdf.imprimir();
        word.imprimir();
    }
}