import testpackage.rishabhs_pack;

// https://www.javatpoint.com/access-modifiers --> For access modifier table

class Example{
    int x = 1; // this cannot be accessed in subclass
    public int a= 4; // this can be accessed everywhere
    private int b = 6;
    public int getB() {
        return b;
    }
    protected int c = 8;
    
}

class Example2 extends Example{
    
    public void meth1(){
        System.out.println(x);
        System.out.println(a);
        // System.out.println(b); // cant access private vars in subclass
        System.out.println(c);
    }
}

public class tut28_access_modifiers {
    public static void main(String[] args) {
        Example one = new Example();
        rishabhs_pack tw = new rishabhs_pack();

        
        System.out.println(one.x);
        System.out.println(one.a);
        // System.out.println(one.b);  this cant be printed as its private
        System.out.println(one.c);
        
        System.out.println(tw.a);  // this is public therefore it can be accessed
        // System.out.println(tw.b); this is private
        // System.out.println(tw.c); this is protected
        // System.out.println(tw.x); this cannot be accessed. Its default

        

        
    }
}
