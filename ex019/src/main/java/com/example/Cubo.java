package com.example;

public class Cubo extends Forma3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}