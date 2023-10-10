public class tut17_method_overloading {
    static void change_num(int a) {
        a = 10;
    }

    static void change_array(int[] lst) {
        lst[0] = 99;
    }

    static void baba(){
        System.out.println("Method overloading");
    }
    static void baba(int a){
        System.out.println(a+": Method overloading");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 5, 7 };

        int a = 8;
        // In java when we try to change an integer through a function it does not
        // happen.
        // This is because when we call a function an copy of the given variable is
        // formed, the original var does not change

        change_num(a);
        System.out.println(a);

        /* However when we do the same thing on an array the value changes. This is because when 
         * we make an array the variable "arr" stores the address of the array rather then the array itself
         * therefore no copy is made here and the changes happen at the original address itself
         */

        System.out.println(arr[0]);
        change_array(arr);
        System.out.println(arr[0]);

        // METHOD OVERLOADING
        // It means that two methods of same name can have different parameters
        // only parameters can differ not the type ie; static/int etc
        baba();
        baba(2);



    }
}
