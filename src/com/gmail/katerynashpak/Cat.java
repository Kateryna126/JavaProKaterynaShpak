package com.gmail.katerynashpak;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " ran " + distance + " m");
        } else {
            System.out.println(getName() + " can`t run " + distance + " m");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " can't swim");

    }
}

