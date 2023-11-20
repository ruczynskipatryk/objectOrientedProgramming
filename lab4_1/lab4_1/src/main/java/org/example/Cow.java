package org.example;

public class Cow extends Animal {
    private int weight;

    public Cow(boolean alive, int weight) {
        super(alive);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
