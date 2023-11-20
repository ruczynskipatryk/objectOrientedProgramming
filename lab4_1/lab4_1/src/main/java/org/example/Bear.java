package org.example;

public class Bear extends Predator {
    private int requiredFood;
    private int currentFoodEaten;

    public Bear(boolean alive, double weight, int requiredFood) {
        super(alive, weight);
        this.requiredFood = requiredFood;
        this.currentFoodEaten = 0;
    }

    public int getRequiredFood() {
        return requiredFood;
    }

    public void setRequiredFood(int requiredFood) {
        this.requiredFood = requiredFood;
    }

    public int getFoodEaten() {
        return this.currentFoodEaten; // Zwraca ilość zjedzonego jedzenia przez niedźwiedzia
    }

    public void eatFood(int foodAmount) {
        this.currentFoodEaten += foodAmount;
        if (this.currentFoodEaten >= this.requiredFood) {
            this.isAlive = true; // Niedźwiedź zjadł wystarczającą ilość jedzenia, aby pozostać żywy
        } else {
            this.isAlive = false; // Niedźwiedź nie zjadł wystarczającej porcji
        }
    }
}
