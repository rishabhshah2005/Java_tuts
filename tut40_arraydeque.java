import java.util.ArrayDeque;

public class tut40_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<Integer>();
        ad1.add(1);
        ad1.add(6);
        ad1.add(4);
        ad1.add(5);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        
    }
}
