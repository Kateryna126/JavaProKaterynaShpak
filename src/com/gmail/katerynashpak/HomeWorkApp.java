package com.gmail.katerynashpak;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5,3);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }


}
}


