package ua.hillel.katerynashpak.homework6;

import java.util.Random;
import java.util.Scanner;

public class SymbolsAndStrings {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello", '1'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ERE"));

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessTheWord(words);
    }

    public static int findSymbolOccurance(String str, char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (symbol == str.charAt(i)) count++;
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = stringReverse(str);
        return str.equals(reversedStr);
    }

    public static void guessTheWord(String[] words) {
        Random random = new Random();
        String guessedWord = words[random.nextInt(words.length)];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the word: ");
            String userWord = scanner.nextLine();

            if (userWord.equals(guessedWord)) {
                System.out.println("Congratulations! You guessed the word!");
                break;
            } else {
                System.out.println("Try again.");
                System.out.println("Hint: " + generateHint(userWord, guessedWord));
            }
        }
    }

    public static String generateHint(String userWord, String guessedWord) {
        StringBuilder hint = new StringBuilder();
        int length = Math.min(userWord.length(), guessedWord.length());

        for (int i = 0; i < length; i++) {
            if (userWord.charAt(i) == guessedWord.charAt(i)) {
                hint.append(userWord.charAt(i));
            } else {
                hint.append('#');
            }
        }

        for (int i = length; i < 15; i++) {
            hint.append('#');
        }

        return hint.toString();
    }

}
