package collectionframework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();
        students.put(101, "Vidhi");
        students.put(102, "Preksha");
        students.put(103, "Gaurav");
        students.put(104, "Shantnu");
//        students.put(105, null);
        System.out.println(students);

        // remove gaurav
//        students.remove(103);
        // getting a value
        System.out.println(students.get(102));

        // checking if key exist
        System.out.println(students.containsKey(101));
        //value
        System.out.println(students.containsValue("Shantnu"));

        for (Integer key : students.keySet()){
            System.out.println("Key : " + key + " value : " + students.get(key));
        }

        Iterator<Map.Entry<Integer, String>> iterator =
                students.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }
}
