package com.test;

import access_modifier.Vehicle;

public class Car extends Vehicle {
    public void showDetails(){
        System.out.println("Car Brand = " + brand);
        displayBrand();
    }
}
