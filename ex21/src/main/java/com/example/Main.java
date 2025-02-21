package com.example;

public class Main {
    public static void main(String[] args) {
    RedeSocial facebook = new Facebook();
        RedeSocial twitter = new Twitter();

        facebook.postar();
        facebook.curtir();
        twitter.postar();
        twitter.curtir();
    }
}