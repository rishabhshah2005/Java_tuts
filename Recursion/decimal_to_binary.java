// Q574. Write a Java program to convert Decimal number to Binary number using recursion.

class D2B{
    public long convert(int x){
        if(x==0){
            return 0;
        }
        else{
            return x%2+(10*convert(x/2));
        }
    }
}

public class decimal_to_binary {
    public static void main(String[] args) {
        D2B b = new D2B();
        System.out.println(b.convert(10));
    }
}
