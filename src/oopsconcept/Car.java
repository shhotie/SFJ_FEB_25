package oopsconcept;

public class Car {
     String model;
    int year;

    void display(){
        System.out.println("Model: " + model + " , Year : " + year);
    }

    public Car(){
        model = "Tesla";
        System.out.println("Default Ctor Called");
    }
}
