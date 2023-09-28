package ua.hillel.katerynashpak.homework3;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " ran " + distance + " m");
        } else {
            System.out.println(getName() + " can`t run " + distance + " m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " swam " + distance + " m");
        } else {
            System.out.println(getName() + " can't swim " + distance + " m");
        }

    }
}