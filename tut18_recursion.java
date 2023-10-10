public class tut18_recursion {

    static long factorial(long n){
        long fact;
        if (n==0){
            return 1;
        }
        else{
            fact = n*factorial(n-1);
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(19));
        
    }
}
