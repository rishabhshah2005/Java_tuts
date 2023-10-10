class Rishabh<DT>{  // this is how we can make our own generics
    private int num;
    private Object anony;
    public Rishabh(int a, DT d){
        num = a;
        anony = d;
    }

    public void getAnony() {
        System.out.print("Type of D here is : ");
        System.out.println(anony.getClass());
    }
    public int getNum() {
        return num;
    }

}

public class tut46_generics {
    public static void main(String[] args) {
        Rishabh<String> rishu = new Rishabh<>(5, "Rishu");
        rishu.getAnony();
        
    }
}
