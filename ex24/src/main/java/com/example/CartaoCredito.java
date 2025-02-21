package com.example;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento() {
        System.out.println("pagamento realizado");
    }

}
