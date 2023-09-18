package com.gmail.katerynashpak;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5, 3);
        printColor(198);
        compareNumbers(6, 5);
        System.out.println(checkSumInRange(5, 9));
        printIsPositive(-7);
        System.out.println(isNegative(7));
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

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    public static void printIsPositive(int num) {
        if (num >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
    public static boolean isNegative(int num) {
        return num < 0;
    }
}



