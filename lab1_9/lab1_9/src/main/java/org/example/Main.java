package org.example;

public class Main {
    public static void main(String[] args) {
        int[] image = {10, 20, 15, 25, 30, 5, 7, 12, 18, 21, 15, 10, 20, 30, 25, 10, 10, 5, 5, 20, 30, 30, 5, 15, 10, 15, 20, 15, 10, 10};
        int[] filteredImage = applySobelFilter(image);

        System.out.println("Obraz przed filtrowaniem:");
        printImage(image);
        System.out.println("Obraz po zastosowaniu filtru:");
        printImage(filteredImage);
    }

    public static int[] applySobelFilter(int[] image) {
        int[] result = new int[image.length];
        for (int i = 0; i < image.length; i++) {
            int sum = 0;
            for (int j = -1; j <= 1; j++) {
                int index = i + j;
                if (index >= 0 && index < image.length) {
                    sum += image[index];
                }
            }
            result[i] = sum / 3;
        }
        return result;
    }

    public static void printImage(int[] image) {
        for (int i = 0; i < image.length; i++) {
            System.out.print(image[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
