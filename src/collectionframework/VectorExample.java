package collectionframework;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Cherry");
        fruits.add("Lichi");
        fruits.add(0,"Apple");
        fruits.add(1,"Orange");
        fruits.add(2,"Coconut");
        fruits.set(0,"Strawberry");
        System.out.println(fruits);

        // Access first element
        System.out.println(fruits.firstElement());
        // Access last element
        System.out.println(fruits.lastElement());
        // access element at index 2
        System.out.println(fruits.get(2));

        //update elements
        fruits.set(0,"Watermelon");
        System.out.println(fruits);

        //remove elemnt at index 1
        fruits.remove(1);
        System.out.println(fruits);

        // check size
        System.out.println(fruits.size());
        // check capacity
        System.out.println(fruits.capacity());

        fruits.add("Cherry");
        fruits.add("Lichi");
        fruits.add("Cherry");
        fruits.add("Lichi");
        fruits.add("Cherry");
        fruits.add("Lichi");
        fruits.add("Cherry");

        System.out.println(fruits.capacity());

        //check if the element exists
        System.out.println(fruits);
        System.out.println(fruits.contains("Strawberry"));

   /*     // Remove all elements
        fruits.clear();

        // check if vector is empty
        System.out.println(fruits.isEmpty());
        */

        for (int i = 0; i < fruits.size(); i++){
            System.out.print(fruits.get(i) + " ");
        }

        System.out.println();
        for (String item : fruits){
            System.out.print(item + " ");
        }
    }
}
