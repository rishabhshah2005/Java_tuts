import java.util.Scanner;

public class practice1_star_pyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter base length: ");
        double n = inp.nextDouble();
        int i = 0;
        
        double upper = (n/2)-0.5;
        double lower = upper;
        // System.out.println(upper);

        do{
            int j =0;
            do{

                if (j>=lower && j<=upper){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }

                j++;
            }while(j!=n);
            System.out.print("\n");
            
            if (upper>=(n-1)){
                break;
            }

            upper++;
            lower--;

            i++;
        }while(i!=n);
        

        inp.close();
    }
}
