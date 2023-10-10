class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cant be negative";
    }

    @Override
    public String getMessage(){
        return "The message is bad radius";
    }
}

public class tut37_throw_vs_throws {

    public static int divide(int a, int b) throws ArithmeticException {
                                                                    // This is to inform in the main method that
                                                                    // this method can return an error
        return a / b;
    }

    public static double area(int r) throws NegativeRadiusException, ArithmeticException{
        if (r<0){
            throw new NegativeRadiusException();
        } 
        return Math.PI *r*r;
    }

    public static void main(String[] args) {
        int one = 8;
        int two = 0;
        int radius = 2;
        // System.out.println(one/two);
        try {
            int res = divide(one, two);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Cant divide by zero");
        }

        try {
            double ar = area(radius);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e);
        }
        


    }
}
