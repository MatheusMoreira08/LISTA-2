package com.example;

public class BoletoBancario implements Pagamento {

    @Override
    public void realizarPagamento() {
        System.out.println("pagamento realizado");
    }
}
