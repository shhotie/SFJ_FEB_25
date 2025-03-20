package interfaceExamples;

public class Bat implements Animal, Bird{
    @Override
    public void eat() {
        System.out.println("Bat is eating insects");
    }

    // provide single impl for common method to avoid ambiguity
    @Override
    public void sound() {
        System.out.println("Bat is making chirping sound");
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
        Bird.super.sleep();
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying at night");
    }
}
