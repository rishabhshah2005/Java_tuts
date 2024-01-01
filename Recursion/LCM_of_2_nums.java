// WAP to find LCM OF TWO NUMS USING RECURSION

class LCM{
    public int gcd(int a, int b){
        if (a==0){
            return b;
        }
        else{
            return gcd(b%a, a);
        }
    }

    public int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
}

public class LCM_of_2_nums {
    public static void main(String[] args) {
        LCM l = new LCM();
        System.out.println(l.lcm(7, 3));
    }
}
