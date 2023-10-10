// https://www.javatpoint.com/multithreading-in-java

class MyThread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Yo dude whats up");

        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("I am very good, how are you??");
        }
    }
}

public class tut29_multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
