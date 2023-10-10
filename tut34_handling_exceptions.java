import java.text.DecimalFormat;
import java.util.Scanner;



public class tut34_handling_exceptions {
    @Deprecated
    public static void process(Scanner inp){
        float ans =0;
        
        try {
            
            System.out.print("Enter dividend: ");
            float dive = inp.nextFloat();
    
            System.out.print("Enter divisor: ");
            float divi = inp.nextFloat();
            ans = dive/divi;
        } catch (ArithmeticException e) {
           System.out.println(e);
           System.out.println("Try again");
           process(inp);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Try again");
            process(inp);
        }

        DecimalFormat func = new DecimalFormat("#.00");
        String str = func.format(ans);

        System.out.printf("Answer is = %s",str);
        // System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        process(scn);

        scn.close();
        
    }
}