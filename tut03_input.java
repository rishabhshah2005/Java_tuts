import java.util.Scanner;

public class tut03_input {
   public static void main(String[] args) {
        System.out.println("Started....");
        Scanner inp = new Scanner(System.in);
        // System.out.println("Enter num 1: ");
        // int a = inp.nextInt();
        // System.out.println("Enter num 2: ");
        // int b = inp.nextInt();
        // System.out.println(a+b + " is the sum");

        String str2 = inp.next(); // next only reads one word
        System.out.println("My name is " + str2);

        String str = inp.nextLine();
        System.out.println(str);

        inp.close();

        // boolean b1 = inp.hasNextInt();
        // System.out.println(b1);
    }
}
