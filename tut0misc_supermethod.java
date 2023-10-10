class A {
    public A() {
        System.out.println("This is A");
    }

    public A(int c) {

        System.out.printf("This is Int A --> %d\n", c);
    }
}

class B extends A {
    public B() {

        System.out.println("This is B");
    }

    public B(int i) {
        super(9);
        System.out.printf("This is Int B --> %d\n", i); // By default no value is given to the constructor of superclass
        // Thats why we use super to give value to the parent class too
    }

    public void getTheErrorOff() {
        System.out.print(" ");
    }
}

public class tut0misc_supermethod {
    public static void main(String[] args) {
        B b = new B(5);
        b.getTheErrorOff();

    }
}
