import java.util.Scanner;

public class tut07_strings {
    public static void main(String[] args) {
        String og = "Rishabh Shah";
        System.out.println(og);
        
        Scanner inp = new Scanner(System.in);
        String a = inp.nextLine();
        System.out.printf("%s is a %s boy", og, a);

        inp.close();
    }
}
