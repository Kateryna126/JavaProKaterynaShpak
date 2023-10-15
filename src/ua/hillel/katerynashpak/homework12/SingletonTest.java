package ua.hillel.katerynashpak.homework12;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Обидва об'єкти є одним і тим же екземпляром Singleton");
        } else {
            System.out.println("Обидва об'єкти НЕ є одним і тим же екземпляром Singleton");
        }
    }
}