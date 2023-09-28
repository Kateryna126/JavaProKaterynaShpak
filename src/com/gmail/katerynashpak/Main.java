package com.gmail.katerynashpak;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(new Entry("John Doe", "+380501234567"));
        phoneBook.add(new Entry("Jane Doe", "+380509876543"));
        phoneBook.add(new Entry("John Smith", "+380501112233"));
        phoneBook.add(new Entry("Jane Smith", "+380509987654"));
        phoneBook.add(new Entry("John Doe", "+380501111111"));


        Entry entry = phoneBook.find("John Doe");
        if (entry != null) {
            System.out.println("Found entry: " + entry.getName() + ", " + entry.getPhone());
        } else {
            System.out.println("Entry not found");
        }

        List<Entry> entries = phoneBook.findAll("John Doe");
        if (entries != null) {
            System.out.println("Found entries:");
            for (Entry e : entries) {
                System.out.println(e.getName() + ", " + e.getPhone());
            }
        } else {
            System.out.println("Entries not found");
        }
    }
}