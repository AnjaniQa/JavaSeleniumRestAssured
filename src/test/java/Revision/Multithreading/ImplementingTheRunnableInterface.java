package Revision.Multithreading;

public class ImplementingTheRunnableInterface implements Runnable {

    public void run() {;
        System.out.println("Implementing The Runnable Interface.");
    }
    public static void main(String[] args) {

        ImplementingTheRunnableInterface i = new ImplementingTheRunnableInterface();
        Thread t = new Thread(i);
        t.start();
    }
}
