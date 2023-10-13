package org.example;

public class Main {
    public static void main(String[] args) {
        int day = 10;
        int month = 1;
        int year = 1998;

        int sum = day + month + year;

        if (sum % 2 == 0) {
            System.out.println("Jestem parzysty");
        } else {
            System.out.println("Jestem nieparzysty");
        }
    }
}
