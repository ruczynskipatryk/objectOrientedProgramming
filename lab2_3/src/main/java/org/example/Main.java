package org.example;
import java.util.Scanner;

class TextAnalyzer {
    public static int countOccurrences(String text, String phrase) {
        int count = 0;
        int index = 0;

        while (index != -1) {
            index = text.indexOf(phrase, index);
            if (index != -1) {
                count++;
                index += phrase.length();
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst (wiele linii):");
        StringBuilder text = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            text.append(line).append('\n');
        }

        System.out.println("Wprowadź frazę do wyszukania:");
        String phrase = scanner.nextLine();

        int occurrences = TextAnalyzer.countOccurrences(text.toString(), phrase);
        System.out.println("Liczba wystąpień frazy: " + occurrences);

        scanner.close();
    }
}
