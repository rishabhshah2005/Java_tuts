/*
 * Collections allows us to modify an array ie: add, delete, edit etc
 * Hashmap is just like dictionary of python
 * A normal array doesnt allow the methods which an array does
*/

import java.util.ArrayList;
// import java.util.Set;
// import java.util.Treeset;
import java.util.Scanner;

public class tut38_collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(44);
        list2.add(56);

        for (int i=1; i < 6; i++) {
            System.out.printf("Enter no. %d: ", i);
            int n = inp.nextInt();
            list.add(n);
        }

        System.out.println(list);
        System.out.println("The size of the list is: "+list.size());
        System.out.println("this is the hashcode: "+list.hashCode());

        // Removing an item
        list.remove(4);
        System.out.println("removed element at index 4");
        System.out.println(list +"\n");

        // Adding an item at 2nd index
        list.add(2, 5);
        System.out.println("Added element at index 2");
        System.out.println(list +"\n");

        // Finding the index of a element --> returns -1 if the element doesnt exist
        System.out.print("Index of 5 is the list is: ");
        System.out.println(list.indexOf(5));

        // Getting the element at index x
        System.out.print("Element at index 0: ");
        System.out.println(list.get(0));
        
        // adds an ArrayList into another array
        list.addAll(list2);
        System.out.println(list);

        inp.close();
    }
}
