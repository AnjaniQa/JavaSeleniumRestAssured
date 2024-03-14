package Java.Concepts.Multithreading.ThreadState;

public class Thread3 {

    void print(int n) throws Exception {

        for(int i=0; i<5; i++) {
            System.out.println(n*1);
            Thread.sleep(1000);
        }
    }

    void display(int n) throws Exception {

        for(int i=0; i<10; i++) {
            System.out.println(n*1);
            Thread.sleep(1000);
        }
    }
}
