/* 
 * Polymorphism is just like tut23 dynamic method dispatch
 * Polymorphism in Java is the task that performs a single action in different ways
 */

interface CellPhone {
    void call();
}

interface Camera {
    private void openCam(){
        System.out.println("Opening camera");
    }
    default void takephoto() {
        openCam();
        System.out.println("Taking a photo"); 
    }

    void recordvideo();
}



interface GPS{
    void getLocation();
}


abstract class CPU {
    abstract void compute();
}

class SmartPhone extends CPU implements GPS, Camera, CellPhone {
    public void call() {
        System.out.println("calling");
    }

    public void recordvideo() {
        System.out.println("recording..");

    }

    public void getLocation() {
        System.out.println("Tracking Location");
    }

    public void compute() {
        System.out.println("Processing");
    }

    public void takephoto() { 
        System.out.println("taking a snap");
    }

}

public class tut27_polymorphism {
    public static void main(String[] args) {
        GPS gps = new SmartPhone();
        gps.getLocation(); // this is allowed
        // gps.call() this is not allowed
        // only GPS functions are allowed here

    }
}