package testpackage;

public class rishabhs_pack {

    public long power(long x, int a) {
    long res = 1;
    for (int b = a; b != 0; b--) {
    res *= x;
    }
    return res;
    }
    int x = 1; // this cannot be accessed in subclass
    public int a = 4; // this can be accessed everywhere
    private int b = 6;
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    protected int c = 8;

    public static void main(String[] args) {
        
    }

}
