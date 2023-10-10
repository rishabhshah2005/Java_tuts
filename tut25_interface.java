/* Interface is just like an abstract class.
 * although they work the same way, when implementing a template more than 1 time
 * using an interface is better.
 * 
 * You cant modify properties of an interface in derived class
 */

interface Bicycle{     
    int a = 69;          
    void speed(int speedup);  // Note: these are also abstract methods. You cant make a body of code here
    void brakes(int brk);
}

class HeroHercules implements Bicycle{
    final int gravity = 10; // final means you cant change the value no matter what

    public void horn(){
        System.out.println("You hear a horn");
    }

    public void speed(int speedup){
        System.out.println("Speeding up");
    }

    public void brakes(int brk){           // all the methods that are in the interface have to public
        System.out.println("Brakes are applied");
    }
}

public class tut25_interface {
    public static void main(String[] args) {
        HeroHercules cyc = new HeroHercules();
        // cyc.gravity = 45; this is not possible
        cyc.brakes(3);
    }
}
