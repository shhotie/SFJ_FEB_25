package abstraction;

public abstract class Vehicle {
    /*
    It is a class that can not be instantiated (we can not create obj of abstract class)
    and may contain
    abstract method (method w/o body)
    +
    concrete method (method with body)

    * can have ctor
    * can have instance var (fields of class) and static method
     */
    abstract void start(); // abstract method
    void stop(){
        System.out.println("Vehicle is stopped"); // concrete method
    }
}
