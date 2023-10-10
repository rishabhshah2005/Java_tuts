import java.util.Scanner;

public class tut33_try_and_catch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {                                  
            System.out.print("Enter num: ");
            int n= inp.nextInt();
            System.out.println(n/10f);

        } catch (Exception e) {                // Note: it is not compulsary to use catch with try
            System.out.println("ERROR: "+e);
        }

        inp.close();
    }
}
