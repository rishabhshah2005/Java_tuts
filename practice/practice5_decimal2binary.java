import java.util.Scanner;

public class practice5_decimal2binary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int deci = inp.nextInt();
        // System.out.println(328%512); -> 328
        String binary = "";
        int temp = deci;
        int cnt = 0;
        double power = Math.pow(2, cnt);
        while (temp%power!=temp){
            cnt++;
            power = Math.pow(2, cnt);
        }
        int length=cnt;
        // System.out.println(length);

        
        for (int i = length;i!=0;i--){
            power = Math.pow(2, i-1);
            if (temp%power==temp){
                binary+="0";
            }
            else{
                binary+="1";
                temp -= power;
            }

        }
        System.out.println("The binary is: "+binary);

        inp.close();
    }
}
