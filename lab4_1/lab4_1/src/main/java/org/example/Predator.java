package org.example;

public class Predator extends Animal {
    public Predator(boolean alive) {
        super(alive);
    }

    public void catchAnimal(Animal animal, int portion) {
        if (animal instanceof Cow) {
            Cow cow = (Cow) animal;
            cow.setAlive(false); // Zabij krowę
            // Zwiększ wagę drapieżnika na podstawie porcji z krowy
        }
    }
}