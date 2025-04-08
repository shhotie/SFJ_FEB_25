package collectionframework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> animals = new TreeSet<>();
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Rabbit");
//        animals.add(null);
        System.out.println(animals);
        System.out.println(animals.lower("Dog"));
    }
}
