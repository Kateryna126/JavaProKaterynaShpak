package com.gmail.katerynashpak;

public class Main {
    public static void main(String[] args) {
        Dog dogRex = new Dog("Rex");
        Cat catPhilip = new Cat("Philip");

        dogRex.run(350);
        catPhilip.run(150);

        dogRex.swim(15);
        catPhilip.swim(2);
    }
}
