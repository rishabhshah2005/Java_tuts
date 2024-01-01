// Q571. WAP to find HCF of two numbers using recursion. 

class HCF{
    int res = 0;
    int count = 1;
    public int hcf(int a, int b){
        if (a%count==0 && b%count==0){
            res = count;
        }
        if (count==Math.max(a, b)){
            int temp = res;
            res=0;
            count =0;
            return temp;
        }
        else{
            count++;
            return hcf(a, b);
        }
    }

    public int gcd(int a, int b){
        if (a==0){
            return b;
        }
        else{
            return gcd(b%a, a);
        }
    }
}

public class HCF_of_2_nums {
    public static void main(String[] args) {
        HCF h = new HCF();
        int x = h.hcf(45, 81);
        System.out.println(x);
        System.out.println(h.gcd(81, 45));
    }
}