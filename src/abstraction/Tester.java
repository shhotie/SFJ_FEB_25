package abstraction;

public class Tester {
    static String college = "ITS";

    static String change(){
        college = "Salesforce Jungle";
        return college;
    }

    static String change1(){
        return "Salesforce Jungle";
    }

    public static void main(String[] args) {
       /*
        Vehicle vehicle; // creating reference // static => stack memory
        vehicle = new Car(); // instantiation // runtime => heap methory
        */

        Vehicle myCar = new Car(); // upcasting
            myCar.start();
            myCar.stop();

        System.out.println(Tester.change1());


    }
}
