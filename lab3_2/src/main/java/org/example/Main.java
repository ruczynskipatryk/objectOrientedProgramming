package org.example;

import java.util.Scanner;

class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public boolean contains(Tetrahedron shape) {
        // Sprawdź, czy środek czworościanu jest wewnątrz sfery
        double centerX = shape.getCenterX();
        double centerY = shape.getCenterY();
        double centerZ = shape.getCenterZ();

        double distance = Math.sqrt(
                (centerX * centerX) +
                        (centerY * centerY) +
                        (centerZ * centerZ)
        );

        return distance + shape.getMaxDimension() <= radius;
    }
}

class Tetrahedron {
    private double edgeLength;

    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double calculateSurfaceArea() {
        return Math.sqrt(3) * edgeLength * edgeLength;
    }

    public boolean contains(Shape3D shape) {
        // Własna implementacja - do zaimplementowania
        return false;
    }

    public double getCenterX() {
        // Własna implementacja - do zaimplementowania
        return 0;
    }

    public double getCenterY() {
        // Własna implementacja - do zaimplementowania
        return 0;
    }

    public double getCenterZ() {
        // Własna implementacja - do zaimplementowania
        return 0;
    }

    public double getMaxDimension() {
        // Własna implementacja - do zaimplementowania
        return 0;
    }
}

interface Shape3D {
    double calculateSurfaceArea();
    double getCenterX();
    double getCenterY();
    double getCenterZ();
    double getMaxDimension();
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzanie parametrów sfery
        System.out.print("Podaj promień sfery: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);

        // Wprowadzanie parametrów czworościanu
        System.out.print("Podaj długość krawędzi czworościanu: ");
        double tetrahedronEdgeLength = scanner.nextDouble();
        Tetrahedron tetrahedron = new Tetrahedron(tetrahedronEdgeLength);

        // Test, czy czworościan mieści się w sferze
        boolean isTetrahedronInSphere = sphere.contains(tetrahedron);
        if (isTetrahedronInSphere) {
            System.out.println("Czworościan mieści się w sferze.");
        } else {
            System.out.println("Czworościan nie mieści się w sferze.");
        }


        scanner.close();
    }
}
