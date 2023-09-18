package com.gmail.katerynashpak;

public class SymbolsAndStrings {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello",'1'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ERE"));
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
}