package com.example;

public abstract class Twitter extends RedeSocial{
    
    @Override
    public void postar() {
        System.out.println("carregando ......");
    }

    public void curtir() {
        System.out.println("curtindo.....");
    }
}
