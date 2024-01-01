// Q572. Write a program to calculate factorial using recursion in Java

class Fact{
    int res = 1;
    public int fact(int a){
        if (a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
}

public class factorial {
    public static void main(String[] args) {
        Fact a = new Fact();
        System.out.println(a.fact(5));
    }
}
