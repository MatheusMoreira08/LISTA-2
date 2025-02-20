package com.example;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente(4500, 1500);
        Funcionario estaiario = new Estagiario(1000, 300);

        System.out.println("Gerente - Salario: " + gerente.calcularSalario());
        System.out.println("Gerente - Bonus " + gerente.calculoBonus());
        gerente.descansar();
        System.out.println("Estagiario - Salário: " + estaiario.calcularSalario());
        System.out.println("Estagiario - Bonus " + estaiario.calculoBonus());
        estaiario.descansar();

    }
}