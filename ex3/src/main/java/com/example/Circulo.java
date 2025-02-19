package com.example;

import java.security.PublicKey;

public class Circulo extends FormaGeometrica {
    
  private double raio;
  private static final double PI = 3.14159;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return PI * raio * raio;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * PI * raio;
  }

}
