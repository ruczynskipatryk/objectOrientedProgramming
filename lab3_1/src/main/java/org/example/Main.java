package org.example;

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {
        // Tworzenie punktu o współrzędnych (2.0, 3.0)
        Point2D point = new Point2D.Double(2.0, 3.0);

        // Tworzenie odcinka o współrzędnych początku (0.0, 0.0) i końca (4.0, 4.0)
        Line2D line = new Line2D.Double(0.0, 0.0, 4.0, 4.0);

        // Tworzenie trójkąta o współrzędnych trzech wierzchołków
        Point2D vertex1 = new Point2D.Double(0.0, 0.0);
        Point2D vertex2 = new Point2D.Double(4.0, 0.0);
        Point2D vertex3 = new Point2D.Double(0.0, 3.0);

        // Tworzenie okręgu o środku (1.0, 1.0) i promieniu 2.0
        Ellipse2D circle = new Ellipse2D.Double(1.0, 1.0, 2.0, 2.0);

        // Sprawdzanie, czy punkt znajduje się w okręgu
        boolean isPointInCircle = circle.contains(point);
        if (isPointInCircle) {
            System.out.println("Tak, punkt znajduje się w okręgu.");
        } else {
            System.out.println("Nie, punkt nie znajduje się w okręgu.");
        }

        // Sprawdzanie, czy odcinek przecina okrąg
        boolean doesLineIntersectCircle = line.intersects(circle.getBounds2D());
        if(doesLineIntersectCircle){
            System.out.println("Tak, linia przecina okrąg.");
        } else {
            System.out.println("Nie, linia nie przecina okręgu.");
        }

        // Do wyświetlenia wyników dodać tego if^ albo funkcje stworzyc i jej wynik wydrukować

        // Wyświetlanie wyników
        System.out.println("Czy punkt znajduje się w okręgu? " + isPointInCircle);
        System.out.println("Czy linia przecina okrąg? " + doesLineIntersectCircle);
    }
}

