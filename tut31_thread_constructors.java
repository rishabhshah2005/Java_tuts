class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        System.out.println("hello this is running");
    }
}

public class tut31_thread_constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("rishabh");
        t1.start();

        System.out.println(t1.getName());
        // System.out.println(t1.getId()); this method is outdated in the new version of java
        System.out.println(t1.threadId());
        
    }
}
