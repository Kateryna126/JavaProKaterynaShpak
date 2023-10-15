package ua.hillel.katerynashpak.homework12;

public class ThreadSafeSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonRunnable());
        Thread thread2 = new Thread(new SingletonRunnable());

        thread1.start();
        thread2.start();
    }

    static class SingletonRunnable implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            System.out.println(singleton);
        }
    }
}

