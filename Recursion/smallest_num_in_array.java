// Q577. WAP to find the smallest number in a array

class Small{
    int findSmall(int[] arr, int n){
        if (n==0){
            return arr[0];
        }
        else{
            return Math.min(arr[n-1], findSmall(arr, n-1));
        }
    }
}

public class smallest_num_in_array {
    public static void main(String[] args) {
        Small s = new Small();
        int[] x = {1,0,4,-7,6,78,10};
        System.out.println(s.findSmall(x, x.length));
    }
}
