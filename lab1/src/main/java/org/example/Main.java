package org.example;

// 1
public class Main {


    public static void main(String[] args) {
        System.out.println("Witaj świecie, tu Patryk Ruczyński!");

        // 2
        String hello = "Witaj świecie, tu Patryk Ruczyński!";

        System.out.println(hello);

        // 3
        String day = "10.";
        String month = "01.";
        String year = "1998";

        System.out.println("Urodziłem się " + day + month + year);

        // 4


        int numberToCheck = 25; // Zmiennej "numberToCheck" przypisujemy liczbę do sprawdzenia

        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " jest liczbą pierwszą.");
        } else {
            System.out.println(numberToCheck + " nie jest liczbą pierwszą.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Liczby mniejsze lub równe 1 nie są liczbami pierwszymi
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // Jeśli liczba jest podzielna przez inną liczbę, to nie jest liczbą pierwszą
            }
        }

        return true; // Jeśli żadna inna liczba nie podzieli liczby, to jest liczbą pierwszą
    }
    
}

