package polymorphism;

public class TestRuntimePolymorphism {
    public static void main(String[] args) {
        /*
        1. method in the child class should have same name,
           return type and parameters
        2. child method can not have weaker access modifier
         */
        // Reference of a superclass
        Animal myAnimal;

        myAnimal = new Dog(); // Dog obj
        myAnimal.sound();
        // Dog sound method will be called

        myAnimal = new Cat(); //Cat obj
        myAnimal.sound();
        // Cat sound method will be called

    }
}
