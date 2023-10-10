// Just like functions in Python

public class tut16_methods {

    static void pow(int x, int a){
        int res = 1;
        for (int i=0; i<a;i++){
            res *= x;
        }

        System.out.println("The answer is: "+res);
    }

    // Method with variable arguments

    static int sum(int ...lst){ // this makes an int [] lst which is a array
        int sum = 0;
        for (int ele: lst){
            sum+=ele;
        }
        return sum;

    }

    public static void main(String[] args) {
        pow(4, 5);
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,55));
        System.out.println(sum());             // when you feed nothing , empty array is formed
        
    }
}
