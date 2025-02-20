package com.example;

public class Estagiario extends Funcionario {
    private double salario;
    private double vale;

    public Estagiario(double salario, double vale) {
        this.salario = salario;
        this.vale = vale;
    }

    @Override
    public double calcularSalario() {
        return salario + vale;
    }

    @Override
    public double calculoBonus() {
        return salario * 0.1;
    }
}
