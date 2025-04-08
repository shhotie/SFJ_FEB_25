package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> animals = new LinkedHashSet<>();
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add(null);
        System.out.println(animals);

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
