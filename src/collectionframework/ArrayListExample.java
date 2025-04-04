package collectionframework;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements
        numbers.add(10);
        numbers.add(1, 20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        numbers.add(2,60);
        System.out.println(numbers);

        numbers.set(3,70);
        System.out.println(numbers);

        System.out.println(numbers.contains(70));

        // access element at index 2
        System.out.println(numbers.get(2));
        numbers.remove(2);
        System.out.println(numbers);

        // check size
        System.out.println(numbers.size());

//        // Remove all elements
//        numbers.clear();
//        System.out.println(numbers);

        // check if arraylist is empty
        System.out.println(numbers.isEmpty());

        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        numbers.add(55);
        numbers.add(65);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.add(75);
        System.out.println(numbers.size());
        // check capacity
//        System.out.println(numbers.capacity());
//        Java does not allow to check the capacity of arraylist


    }
}
