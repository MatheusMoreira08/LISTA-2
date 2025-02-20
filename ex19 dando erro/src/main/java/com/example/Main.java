package com.example;

public class Main {
    public static void main(String[] args) {
        Forma3D esfera = new Esfera(5);
        Forma3D cubo = new cubo(4);

        System.out.println("Volume da Esfera: " + esfera.calcularVolume());
        System.out.println("Volume do Cubo: " + cubo.calcularVolume());
    }
}
