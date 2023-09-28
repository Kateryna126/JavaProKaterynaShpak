package com.gmail.katerynashpak;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Entry> entries;

    public PhoneBook() {
        this.entries = new ArrayList<>();
    }

    public void add(Entry entry) {
        this.entries.add(entry);
    }

    public Entry find(String name) {
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        List<Entry> result = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                result.add(entry);
            }
        }
        return result.isEmpty() ? null : result;
    }
}

class Entry {
    private String name;
    private String phone;

    public Entry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
