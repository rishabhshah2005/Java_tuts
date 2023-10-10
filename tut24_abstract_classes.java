abstract class Parent{
    /* An abstract class is the base class for other methods, acts as a skeleton for other classes
     * Abstract methods can only be made in abstract classes
     * the abstract methods should surely be made in derived classes or else it shows an error
     * its a kind of override
     */
    public void hello(){
        System.out.println("Hello!!");
    }
    // abstract int x; this is not allowed
    int x = 56;

    abstract public void greet();
}

class Son extends Parent{
    @Override
    public void greet(){
        System.out.println("I am the son");
    }

}

class Daughter extends Parent{
    @Override
    public void greet(){
        System.out.println("I am the Daughter");
    }
}


public class tut24_abstract_classes {

    public static void main(String[] args) {
        Son son = new Son();
        Daughter daug = new Daughter();
        son.greet();
        daug.greet();
        // however abstract class cannot be called
        // Parent par = new Parent(); 
        
    }
}
