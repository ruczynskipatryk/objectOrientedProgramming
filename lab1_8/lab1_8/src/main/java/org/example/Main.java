package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "To jest przykładowy tekst do sprawdzenia.";

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    System.out.println(c + " to samogłoska.");
                } else {
                    System.out.println(c + " to spółgłoska.");
                }
            } else {
                System.out.println(c + " to inny znak.");
            }
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
