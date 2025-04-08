package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        System.out.println(fruits);
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
        fruits.add("Mango");
        System.out.println();
        System.out.println(fruits);
        fruits.remove("Mango");
        System.out.println(fruits);

        System.out.println(fruits.size());

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
