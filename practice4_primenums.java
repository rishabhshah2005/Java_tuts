import java.util.Scanner;


public class practice4_primenums {

    public static boolean isPrime(int n){
        boolean pri = true;
        for (int i=2; i!=n+1; i++){
            if (n%i==0 && i!=n) {
                pri = false;
                break;
            }
        }
        return pri;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter no. of primes: ");
        int num = inp.nextInt();
        int count = 0;

        int i = 1;
        while (num!=count){
            if (isPrime(i)){
                System.out.println(i);
                count++;
                i++;
            }
            else{
                i++;
                continue;
            }
            
        }

        inp.close();

        
    }
}
