package com.example;

public class Smartphone implements Dispositivo {
    
    @Override
    public void conectarInternet() {
        System.out.println("conectando a internet");
    }
}
