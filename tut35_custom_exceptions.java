import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        // return super.toString() + " --> This is the toString method.";
        return " --> This is the toString method.";
    }

    @Override
    public String getMessage(){
        // return super.getMessage() + " --> This is the getMessage method";  // super.getMessage() returns the result that would have come in the super class
        return " --> This is the getMessage method";
    }
}

public class tut35_custom_exceptions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = inp.nextInt();

        if (n>5){
            try {
                inp.close();
                throw new MyException();
                // throw new ArithmeticException("This is wild");
            } catch (Exception e) {
                // System.out.println(e); // By default this runs the e.toString() method
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace(); // prints a error msg in red. This message shows in which line the error occured
                // System.out.println("Finished");
            }   
        }

        inp.close();
        
    }
}
