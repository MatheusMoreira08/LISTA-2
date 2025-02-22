package com.example;
import java.util.ArrayList;
import java.util.List;


public class Restaurante {
   private List<Prato> pratos;

   public Restaurante() {
    this.pratos = new ArrayList<>();
   }

   public void adicionarPrato(Prato prato) {
    pratos.add(prato);
   }

   public void listarPratos() {
    for (Prato prato : pratos) {
        System.out.println(prato.getDescricao());
    }
   }
}
