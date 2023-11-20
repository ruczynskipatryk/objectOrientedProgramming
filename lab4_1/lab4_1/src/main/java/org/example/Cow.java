package org.example;

class Cow extends Animal {
    private boolean isAlive;
    private int weight;

    public Cow(int weight) {
        this.isAlive = true;
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getWeight() {
        return weight;
    }

    public void kill() {
        this.isAlive = false;
    }
}
