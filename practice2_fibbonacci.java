import java.util.Scanner;

public class practice2_fibbonacci {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = inp.nextInt();
        inp.close();

        long last = 0L;
        long nw = 1L;

        System.out.println(last);
        System.out.println(nw);

        for (int i=2; i<=n;i++){
            long calc = last+nw;
            System.out.println(calc);
            last = nw;
            nw = calc;

        }        
    }

}
