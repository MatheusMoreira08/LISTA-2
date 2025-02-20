package com.example;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente(4500, 1500);
        Funcionario estaiario = new Estagiario(1000, 300);

        System.out.println("Gerente - Salário: " + gerente.calcularSalario());
        System.out.println("Gerente - Salário: " + estaiario.calcularSalario());

    }
}