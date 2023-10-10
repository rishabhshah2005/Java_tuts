class MyThr extends Thread{
    String nam;
    public MyThr(String name){
        super(name);
        this.nam = name;
    }
    

    public void run(){
        long i = 0;
        while (i!=30) {
            System.out.printf("%s --> %d\n", nam, i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class tut32_thread_methods {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Rishabh");
        MyThr t2 = new MyThr("Avi");

        t1.setPriority(1); // 5 is the default priority
        t2.setPriority(9);

        t1.start();
        
        // try {
        //     t1.join();  // join method only starts the second thread once the first is completed
        //     Thread.sleep(2000);
            
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();

    }
}
