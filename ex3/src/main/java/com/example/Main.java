package com.example;

import java.text.Normalizer.Form;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(2);
        FormaGeometrica retangulo = new Retangulo(10, 12);
 
        System.out.println("Circulo - Area: " + circulo.calcularArea() + "perimetro: " + circulo.calcularPerimetro());
        System.out.println("Retangulo - area" + retangulo.calcularArea() + "perimetro: " + retangulo.calcularPerimetro());
    
    }
}