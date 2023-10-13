package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[50];  // Twój wybór wartości
        int sum = 0;

        // Inicjalizacja tablicy i obliczenie sumy
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;  // Przykładowe wartości
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Elementy mniejsze od średniej (" + average + "):");
        for (int number : numbers) {
            if (number < average) {
                System.out.print(number + " ");
            }
        }
    }
}
