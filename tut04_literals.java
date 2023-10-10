public class tut04_literals {
    public static void main(String[] args) {
        // byte age = 127; // max value that can be used in byte is 127
        // char a = 'A'; // for char '' single quotes are used
        // float flt = 2.7f; // by default any decimal value is a double to make it a float add 'f' at the end
        // double dbl = 3.3;

        // Note: The difference between a double and a float is that double can store much larger decimals
        //       float: six places of decimal, while  double: 15 places of decimal
        //       float stores 32bit values while double stores 64bit values, hence the name double

        long lng = 232038208l;
        String b = "hello";
        String c = "world";
        // double v = 1.4E45; // note: using E means 10's power is the number followed
        System.out.println(lng * 2);
        System.out.println(b + c);

        System.out.println("we can see the max possible values of the dataypes");
        System.out.println("Max value of a Integer: "+Integer.MAX_VALUE);
        System.out.println("Max values of a Double: "+Double.MAX_VALUE);
        System.out.println("Max values of a Float: "+Float.MAX_VALUE);
        System.out.println("Max values of a Long: "+Long.MAX_VALUE);
    }
}
