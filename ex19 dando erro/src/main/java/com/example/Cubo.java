package com.example;

class cubo extends Forma3D {
    private double lado;

    public cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
