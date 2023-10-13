package org.example;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        boolean[] booleanArray = {true, false, true, false, true};

        System.out.println("To jest tablica liczb całkowitych: " + arrayToString(intArray));
        System.out.println("To jest tablica liczb zmiennoprzecinkowych: " + arrayToString(doubleArray));
        System.out.println("To jest tablica znaków: " + arrayToString(charArray));
        System.out.println("To jest tablica wartości logicznych: " + arrayToString(booleanArray));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(", ");
        }
        return sb.toString();
    }

    public static String arrayToString(double[] arr) {
        StringBuilder sb = new StringBuilder();
        for (double num : arr) {
            sb.append(num).append(", ");
        }
        return sb.toString();
    }

    public static String arrayToString(char[] arr) {
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c).append(", ");
        }
        return sb.toString();
    }

    public static String arrayToString(boolean[] arr) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : arr) {
            sb.append(b).append(", ");
        }
        return sb.toString();
    }
}
