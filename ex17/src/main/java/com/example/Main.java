package com.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        restaurante.adicionarPrato(new Pizza("Pizza de Calabresa", 35.90, "Grande"));
        restaurante.adicionarPrato(new Sushi("Sushi Variado", 25.50, 12));

        System.out.println("Cardápio do Restaurante:");
        restaurante.listarPratos();
    }
}
