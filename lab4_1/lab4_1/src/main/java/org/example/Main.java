package org.example;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Bear bear = new Bear(true, 100.0, 150); // Niedźwiedź musi zjeść przynajmniej 150 jedzenia


        // Symulacja jedzenia przez wilka i niedźwiedzia
        wolf.eatFood(120); // Wilk zjada 120 jedzenia
        bear.eatFood(200); // Niedźwiedź zjada 200 jedzenia

        // Sprawdzenie, który zwierzę wygrało zawody
        if (wolf.isAlive() && bear.isAlive()) {
            if (wolf.getFoodEaten() > bear.getFoodEaten()) {
                System.out.println("Zwycięzcą jest Wilk! Zjadł więcej jedzenia i przeżył.");
            } else if (bear.getFoodEaten() > wolf.getFoodEaten()) {
                System.out.println("Zwycięzcą jest Niedźwiedź! Zjadł więcej jedzenia i przeżył.");
            } else {
                System.out.println("Remis! Wilk i Niedźwiedź zjadły tę samą ilość jedzenia.");
            }
        } else if (wolf.isAlive()) {
            System.out.println("Wilk wygrał, ponieważ tylko on przeżył.");
        }
            else if (bear.isAlive()) {
        System.out.println("Niedźwiedź wygrał, ponieważ tylko on przeżył.");
            {
        System.out.println("Oba zwierzęta nie przeżyły.");
    }
}}}

