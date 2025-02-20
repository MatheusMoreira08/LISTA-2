package com.example;

public class Main {
    public static void main(String[] args) {
        Transporte moto = new Moto();
        Transporte caminhao = new Caminhao();


        System.out.println("A velcidade maxima da moto e: " + moto.velocidadeMaxima() + "km");
        System.out.println("A velocidade maxima do caminhao e: " + caminhao.velocidadeMaxima() + "km");
    }
}