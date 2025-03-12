package inheritance;

public class Tester {
    public static void main(String[] args) {
        // Single level inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel
        BabyDog babyDog = new BabyDog();
        babyDog.eat(); // method of Animal Class
        babyDog.bark(); // method of Dog class
        babyDog.weep();

        //Hierarchical
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // Multiple Inheritance
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
