package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź współrzędne pierwszego punktu:");
        double x1 = getCoordinate("x");
        double y1 = getCoordinate("y");

        System.out.println("Wprowadź współrzędne drugiego punktu:");
        double x2 = getCoordinate("x");
        double y2 = getCoordinate("y");

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Odległość między punktami: " + distance);

        scanner.close();
    }

    public static double getCoordinate(String axis) {
        Scanner scanner = new Scanner(System.in);
        double coordinate = 0;

        while (true) {
            System.out.print("Wprowadź współrzędną " + axis + ": ");
            if (scanner.hasNextDouble()) {
                coordinate = scanner.nextDouble();
                break;
            } else {
                System.out.println("To nie jest prawidłowa wartość. Wprowadź liczbę.");
                scanner.next();
            }
        }

        return coordinate;
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
