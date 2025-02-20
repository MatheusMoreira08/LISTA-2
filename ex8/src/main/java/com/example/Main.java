package com.example;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("cinza");
        Veiculo bicicleta = new Bicicleta("azul");

        carro.mover(); 
        carro.verCor();
        bicicleta.mover();
        bicicleta.verCor();
    }
}