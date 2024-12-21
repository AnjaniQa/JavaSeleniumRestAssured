package Revision.Multithreading;

public class ExtendingTheThreadClass extends Thread {

    public void run() {
        System.out.println("Creating thread.");
    }
    public static void main(String[] args) {

        ExtendingTheThreadClass m = new ExtendingTheThreadClass();
        m.start();
        State state = Thread.currentThread().getState();
        System.out.println(state.name());
    }
}
