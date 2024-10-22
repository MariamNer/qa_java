package com.example;

public class Main {

    public static void main(String[] args) {
        Feline feline = new Feline();
        Lion lion;
        try {
            lion = new Lion(feline, "Самец");
            lion.getFood();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
