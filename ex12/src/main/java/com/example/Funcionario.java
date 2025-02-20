package com.example;

abstract class Funcionario {
    public abstract double calcularSalario();

    public void descansar() {
        System.out.println("Estou cansado chefe ");
    }

    public double calculoBonus() {
        return 0.0;
    }
}
