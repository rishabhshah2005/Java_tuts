import java.util.Scanner;

public class practice6_leapyear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = inp.nextInt();
        /*
         * For a year to be a leap year it should be divisible by 4 but not divisible by 100
         * although its a leap year if its divisible by 400
         */

        if ((year%4==0 && year%100!=0) || year%400==0) {
            System.out.println(year+" is a leap year!!");
        }

        else{
            System.out.println(year+" is not a leap year :(");
        }

        inp.close();
    }
}
