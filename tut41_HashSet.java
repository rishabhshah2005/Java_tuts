/*
 * A hashset stores data in such a way that it is faster to find it in large datasets
 * It gives almost constant time of finding no matter how large the set is
 * here the location of the data depends on its value, therefore it is easy to find 
 * Also it is a Set, therefor it cannot have two same numbers in it
 */

import java.util.HashSet;

public class tut41_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(4);
        h1.add(4); // If we add 4 twice it will still count as one
        
        h1.add(5);
        h1.add(1);
        System.out.println(h1);

        Object [] arr = h1.toArray();
        System.out.println(arr);

        String test = h1.toString();
        System.out.println(test);
    }
}
