

public class tut15_multi_dim_arrays {
    public static void main(String[] args) {
        // System.out.println(10 + 23);
        System.out.println("Multi-Dimensional Arrays ");

        int [][] flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;


        for (int ele[]: flats){
            
            System.out.print("\n");
            for (int i: ele){
                System.out.print(i+" ");
            }
        }
    }
}