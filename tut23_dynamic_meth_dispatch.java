class Class{
    public void meth1(){
        System.out.println("This is class");

    }
    public void meth(){
        System.out.println("This is class method");

    }
    
}

class SubClass extends Class{
    @Override
    public void meth1(){
        System.out.println("This is the subclass");
    }
    public void meth2(){
        System.out.println("This is the subclass meth 2");
    }

}

public class tut23_dynamic_meth_dispatch {
    public static void main(String[] args) {
        Class obj = new SubClass();  // This is acceptable in java
        // SubClass obj = new Class(); // this is unacceptable
        obj.meth1();  // Here overrided methods of subclass can be used 
        // obj.meth2();
        obj.meth();
        
    }
}
