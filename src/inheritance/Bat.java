package inheritance;

public class Bat implements AnimalInterface, BirdInterface{
    @Override
    public void eat() {
        System.out.println("Bat is Eating");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }
}
