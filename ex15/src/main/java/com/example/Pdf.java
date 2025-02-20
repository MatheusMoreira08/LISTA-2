package com.example;

import java.security.PublicKey;

public class Pdf extends Documento {
    
    @Override
    public void imprimir() {
        System.out.println("Estamos imprimindo em pdf");
    }
}
