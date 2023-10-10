// Note: a code in java can only have one public class.
class Employee{
    int id;
    String name;
    int age;

    public void sayMyName(){
        System.out.println(name+"...you're goddamm right. ");
    }
}

public class tut19_classes {
    public static void main(String[] args) {
        Employee rishabh = new Employee();
        rishabh.name = "Rishabh Shah";
        rishabh.age = 18;
        rishabh.id = 1;
        rishabh.sayMyName();

    }
}
