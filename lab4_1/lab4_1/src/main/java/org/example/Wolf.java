package org.example;

class Wolf extends Predator {
    private boolean isAlive;
    private int weight;

    public Wolf() {
        super(true, 0.0);
        this.isAlive = true;
        this.weight = 0;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getWeight() {
        return weight;
    }

    public void catchPrey(Animal animal) {
        if (animal instanceof Cow) {
            Cow cow = (Cow) animal;
            this.weight += cow.getWeight() / 2;
            cow.kill();
        }
    }

    public int getFoodEaten() {
        return this.weight; // Zwraca ilość zjedzonego jedzenia przez wilka
    }

    public void eatFood(int foodAmount) {
        this.weight += foodAmount;
    }
}
