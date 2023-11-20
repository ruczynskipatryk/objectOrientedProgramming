package org.example;

public class Bear extends Predator {
    private int requiredFood; // Minimalna ilość jedzenia, aby niedźwiedź pozostał żywy
    private int currentFoodEaten; // Aktualna ilość zjedzonego jedzenia

    public Bear(boolean alive, int requiredFood) {
        super(alive);
        this.requiredFood = requiredFood;
        this.currentFoodEaten = 0;
    }

    public int getRequiredFood() {
        return requiredFood;
    }

    public void setRequiredFood(int requiredFood) {
        this.requiredFood = requiredFood;
    }

    public void eatFood(int foodAmount) {
        currentFoodEaten += foodAmount;
        if (currentFoodEaten >= requiredFood) {
            setAlive(true); // Niedźwiedź zjada wystarczającą ilość jedzenia, aby pozostać żywy
        } else {
            setAlive(false); // Niedźwiedź nie zjadł wystarczającej porcji

        }}}