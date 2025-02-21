package com.example;

public class Main {
    public static void main(String[] args) {
        Dispositivo smartphone = new Smartphone();
        Dispositivo smarttv = new SmartTV();

        smartphone.conectarInternet();
        smarttv.conectarInternet();
        
    }
}