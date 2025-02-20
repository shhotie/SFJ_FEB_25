package com.test;

import access_modifier.Animal;

public class Tester {
    public static void main(String [] args){
        Student student1 = new Student();
        student1.rollNo= 101;
        student1.displayRollNo();

        Car car = new Car();
        car.showDetails();

        Animal cat = new Animal();
        cat.type = "Domestic";
        cat.eat();
        cat.animalType();
        cat.drinking();
    }
}
