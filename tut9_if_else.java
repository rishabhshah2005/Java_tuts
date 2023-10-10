import java.util.Scanner;

public class tut9_if_else {
    public static void main(String[] args) {
        int age;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = inp.nextInt();

        if (age >= 18) {
            System.out.println("You can drive!!");
        }

        else if(age<7){
            System.out.println("You are a baby!!:)");
        }

        else {
            System.out.println("You cannot drive!!");
        }

        inp.close();

    }
}
