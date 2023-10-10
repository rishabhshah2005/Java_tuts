interface CellPhone {
    void call();
}

interface Camera {
    private void openCam(){
        System.out.println("Opening camera");
    }
    default void takephoto() {
        openCam();
        System.out.println("Taking a photo"); // this is a default method
    }

    void recordvideo();
}

// Note: interfaces also can be extended

interface GPS extends CellPhone {
    void getLocation();
}


abstract class CPU {
    abstract void compute();
}

class SmartPhone extends CPU implements GPS, Camera {
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

    public void takephoto() { // you can override default methods
        System.out.println("taking a snap");
    }

}

public class tut26_more_on_interfaces {
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        nokia.call();
        nokia.compute();
        nokia.takephoto();
        nokia.getLocation();
    }
}