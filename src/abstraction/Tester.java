package abstraction;

public class Tester {
    public static void main(String[] args) {
       /*
        Vehicle vehicle; // creating reference // static => stack memory
        vehicle = new Car(); // instantiation // runtime => heap methory
        */

        Vehicle myCar = new Car(); // upcasting
        myCar.start();
        myCar.stop();
    }
}
