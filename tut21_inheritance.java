// Inheritance is an concept in which we can extend the code/methods/variables of a class to another class

class Base {
    int x;
    int y;

    // also, if constructors are present in both base class and derived class, first
    // the constructors of base class runs then that of derived class
    public void setX(int val) {
        this.x = val;
    }

    public void setY(int val) {
        this.y = val;
    }

    public int sum() {
        return x + y;
    }
}

class Derived extends Base {
    public void printSum() { // Note: private variables and methods cant be accessed in derived class
        System.out.println(sum());
    }
}

public class tut21_inheritance {
    public static void main(String[] args) {
        Derived a = new Derived();
        a.setX(5);
        a.setY(8);

        a.printSum();
    }
}
