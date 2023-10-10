// Hashmaps are basically dictionaries of java


import java.util.HashMap;

public class tut42_HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        // adding key value pairs
        map.put("Rishabh", "Good");
        map.put("Nina", "Very Bad");
        map.put("Avi", "Good");
        map.put("Jack", "Bad");

        System.out.println(map);

        // creating a clone
        Object clone = map.clone();
        System.out.println(clone);

        // To see all the keys and the values
        Object keys = map.keySet();
        Object vals = map.values();
        System.out.println("The keys are: "+keys);
        System.out.println("The Values are: "+vals);

        // Checking for keys
        System.out.println("Does it contain key Rishabh: "+map.containsKey("Rishabh"));
        System.out.println("Does it contain key habla: "+map.containsKey("habla"));

        // Size of the map
        System.out.println("The size of the map is: "+map.size());

        // Getting the value of the key
        System.out.println(map.get("Avi"));

    }
}
