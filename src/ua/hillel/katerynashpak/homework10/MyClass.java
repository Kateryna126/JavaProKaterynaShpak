package ua.hillel.katerynashpak.homework10;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple");
        String word = "apple";
        System.out.println("Count of '" + word + "' : " + myClass.countOccurance(words, word));

        int[] array = {1, 2, 3};
        System.out.println("Array to list: " + myClass.toList(array));

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        System.out.println("Unique numbers: " + myClass.findUnique(numbers));

        System.out.println("Word occurrences:");
        myClass.calcOccurance(words);

        List<WordOccurrence> occurrences = myClass.findOccurance(words);
        for (WordOccurrence wo : occurrences) {
            System.out.println("Word: " + wo.getName() + ", " + "occurrence: " + wo.getOccurrence());
        }
    }

    public int countOccurance(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    public List<Integer> findUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public void calcOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public class WordOccurrence {
        String name;
        int occurrence;

        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOccurrence() {
            return occurrence;
        }

        public void setOccurrence(int occurrence) {
            this.occurrence = occurrence;
        }
    }

    public List<WordOccurrence> findOccurance(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }

}