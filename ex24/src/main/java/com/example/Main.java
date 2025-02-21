package com.example;

public class Main {
    public static void main(String[] args) {
        Pagamento cartaocredito = new CartaoCredito();
        Pagamento boletobancario = new BoletoBancario();

        cartaocredito.realizarPagamento();
        boletobancario.realizarPagamento();
    } 
}