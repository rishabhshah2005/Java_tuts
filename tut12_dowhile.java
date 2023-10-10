public class tut12_dowhile {
    public static void main(String[] args) {
        // int a = 5;
        // while (a<5){                         // In normal loop first the condition is checked then the loop begins
        //     System.out.println(a++);
        // }

        int a = 5;
        do{
            System.out.println(a++);            // Here first the loop is used once then the condition is checked
        }while (a<5);
    }
}
