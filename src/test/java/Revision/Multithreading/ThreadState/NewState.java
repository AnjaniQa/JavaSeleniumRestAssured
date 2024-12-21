package Revision.Multithreading.ThreadState;

public class NewState extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
    }

    public static void main(String[] args) {

        NewState n = new NewState();
        System.out.println(Thread.currentThread().getState());
        n.start();
        
    }
}
