package com.example;

 import com.example.Deposito;
 import com.example.Saque;

public class Main {
    public static void main(String[] args) {
        Banco deposito = new Deposito();
        deposito.realizarTransacao(500.0);
        
        
        Banco saque = new Saque();
        saque.realizarTransacao(200.0);
    }
}