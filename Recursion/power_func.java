// Q573. Write a Java program to calculate the power of a number like power(int
// number, int power) like power(2, 3) should return 8

class Pow{
    public int pow(int x, int a){
        if (a==1){
            return x;
        }
        else if (a==0){
            return 1;
        }
        else{
            return x*pow(x, a-1);
        }

    }
}

public class power_func {
    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.pow(2, 8));
    }
}
