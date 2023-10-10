import java.util.Scanner;

public class practice_boardpercentage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter marks in Physics: ");
        int phy = inp.nextInt();
        
        System.out.println("Enter marks in Maths: ");
        int math = inp.nextInt();
        
        System.out.println("Enter marks in Chemistry: ");
        int chem = inp.nextInt();
        
        System.out.println("Enter marks in English: ");
        int eng = inp.nextInt();
        
        System.out.println("Enter marks in CS: ");
        int cs = inp.nextInt();

        float tot = (math+eng+chem+cs+phy)/5f;

        System.out.println(tot+"%");
        
        
        inp.close();
    }
}
