import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbę do sprawdzenia czy jest liczbą pierwszą: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " jest liczbą pierwszą.");
            } else {
                System.out.println(number + " nie jest liczbą pierwszą.");
            }
        } else {
            System.out.println("To nie jest liczba całkowita.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
