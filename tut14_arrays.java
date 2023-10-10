public class tut14_arrays {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        // System.out.println(marks[0]);
        // System.out.println(marks.length);

        // another way to make an array

        String [] names = {"Rishabh", "Avi", "mummy", "John", "Bambalshri"};
        System.out.println("Length of names array: "+names.length);

        names[1] = "Avi Patel";
        System.out.println(names[1].length());

        // test to see what is default values in an empty array
        // int [] test = new int[5];
        // System.out.println(test.length);
        // System.out.println(test[3]);

        System.out.println("Printing all the names in normal way");

        for (int i=0; i!=names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Printing elements in an new/easier way");
        for (String element: names){
            System.out.println(element);
        }
    }
}
