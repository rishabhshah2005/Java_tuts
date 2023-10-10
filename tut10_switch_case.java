import java.util.Scanner;

public class tut10_switch_case {
    public static void main(String[] args) {
        int age;
        Scanner inp;
        System.out.print("Enter age: ");
        inp = new Scanner(System.in);
        age = inp.nextInt();

        switch (age) {
            case 18:
                System.out.println("Adult");
                break;
            case 50:
                System.out.println("Half-Century");
                break;
            case 100:
                System.out.println("Century");
                break;

            // case 8 -> System.out.println("Avi");        //  this is also acceptable
            // default -> System.out.println("Rishabh");

            default:
                System.out.println("I dont care.");

        }

        inp.close();
    }
}
