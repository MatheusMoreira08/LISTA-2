package com.example;

abstract class Funcionario {
    public abstract double calcularSalario();

    public void descansar() {
        System.out.println("Estoy cansado chefe ");
    }

    public double calculoBonus() {
        return 0.0;
    }
}
