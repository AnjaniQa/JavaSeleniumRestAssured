package Java.Concepts.ThisKeyword.ThisToReturnCurrentClassInstance;

class A {

    A get() {
        return this;
    }

    void display() {
        System.out.println("this");
    }

}
