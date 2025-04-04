package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        // create a LL
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println(fruits);

        for (String fruit : fruits){
            System.out.print(fruit +" ");
        }
        System.out.println();

        // add at the begining
        fruits.addFirst("Pineapple");

        // add at the end
        fruits.addLast("Watermellon");
        System.out.println(fruits);

        // Access element at the first place
        System.out.println(fruits.getFirst());
        //last
        System.out.println(fruits.getLast());
        // index =2
        System.out.println(fruits.get(2));

        //update element
        fruits.set(2, "Mango");
        System.out.println(fruits);


        //Removal
      /*  fruits.removeFirst();
        fruits.removeLast();
        fruits.remove(2);*/

        //size
        System.out.println(fruits.size());

        //check if the element exist
        System.out.println(fruits.contains("Apple"));


        //Remove all elements
//        fruits.clear();
        System.out.println(fruits);

        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        Collections.sort(fruits);
        System.out.println(fruits);

        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println(fruits);

    }
}
