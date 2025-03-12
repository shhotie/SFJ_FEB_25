package ctorChaining;

public class Vehicle {
    String type;

    Vehicle(String type){
        this.type = type;
        System.out.println("Vehicle Ctor called");
    }
}
