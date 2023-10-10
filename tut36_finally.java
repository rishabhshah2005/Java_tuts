/*
 * Finally block contains the code which is always executed whether the exception is handeled or not.
 * it is used to execute the code which is important to excute
 * 
 * this block can only be used with the try method
 */

public class tut36_finally {

    public static Object hello(int a){ // This is just something I discovered
                                       // As every Object is the superclass of every datatype,
                                       // If a method can return two datatypes if we put Object in the declaration
        if (a==0){
            return "This is zero";
        }
        else if(a<0){
            return null;
        }
        else{
            return 23;
        }
    }
    public static void main(String[] args) {

        try {
            int a = 2;
            int b = 0;
            System.out.println(a / b);

        } 
        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("This is the end of program");
            System.out.println(hello(-9));
            System.out.println((double)22/7); // Note: by doing this you can declare before hand what the datatype is
        }

    }
}
