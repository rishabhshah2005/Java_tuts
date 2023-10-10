class Thread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Sheldon");
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run(){
        while (true){
            System.out.println("Leonard");
        }
    }
}
class Thread3 implements Runnable{
    public void run(){
        while (true){
            System.out.println("Howard");
        }
    }
}
class Thread4 implements Runnable{
    @Override
    public void run(){
        while (true){
            System.out.println("Raj");
        }
    }
}

public class tut30_thread_using_runnable_interface {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();

        Thread sheldon = new Thread(t1);
        Thread leonard = new Thread(t2);
        Thread howard = new Thread(t3);
        Thread raj = new Thread(t4);

        sheldon.start();
        leonard.start();
        howard.start();
        raj.start();
    }
}
