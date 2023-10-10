public class tut08_string_methods {
    public static void main(String[] args) {
        String name = "Rishabh Shah";

        int a = name.length();
        System.out.println(a);

        String b = name.toLowerCase();
        System.out.println(b);

        String c = name.toUpperCase();
        System.out.println(c);

        String spaces = "   jdnu   ";
        String d = spaces.trim();    // To remove spaces 
        System.out.println(d);

        String e = name.substring(1, 8); // to print a substring
        System.out.println(e);

        String f = name.replace('h', 'r');
        String g = name.replace("Ris", "Bis");
        System.out.println(f);
        System.out.println(g);

        System.out.println(name.startsWith("Ru"));
        System.out.println(name.endsWith("h"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf('s'));

        System.out.println(name.lastIndexOf("h"));

        System.out.println(name.equals("Rishabh Shah"));

        System.out.println(name.equalsIgnoreCase("risHabh shAh"));

        
    } 
}
