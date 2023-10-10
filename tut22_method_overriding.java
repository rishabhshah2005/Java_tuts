class A {
    int x;

    public int meth1() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }

}

class B extends A {

    @Override // This satement is optional, it tells if the method is overrided or not. It
              // shows a error on non-overrided methods
    public void meth2() {
        System.out.println("This is method 1 of class B");
    }

    public void meth3() {
        System.out.println("This is method 2 of class B");
    }
}

public class tut22_method_overriding { // In method overrinding we change the same method in the derived class
    public static void main(String[] args) {
        A var1 = new A();
        var1.meth2();

        B b = new B();
        b.meth2();

    }
}
