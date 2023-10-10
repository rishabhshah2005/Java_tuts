class MyEmployee{
    private int id;                      // By using private the values of the vars cant be tampered by any code outside the class
    private int age;
    private long salary;
    int junk = id+age;
    private String name;

    public MyEmployee(int id, int age, long salary, String name){ // this is a constructor
                                                                  // this function is executed without calling
        this.id = id;                                             // this func has the same name as the class
        this.age = age;                                           // "this" keyword is just like self.id in python 
        this.salary = salary;                                     // the parameters of this method become the parameters of the class
        this.name = name;

    }

    public void getName(){System.out.println("My name is "+name);}
    public void getSalary(){System.out.println(name+"'s  salary is: "+salary);}
    
}



public class tut20_constructors {
    public static void main(String[] args) {
        MyEmployee ris = new MyEmployee(1, 18, 20000, "rishabh shah");
        ris.getName();
        ris.getSalary();
        
    }
}
