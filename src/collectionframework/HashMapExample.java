package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Vidhi");
        students.put(102, "Preksha");
        students.put(103, "Gaurav");
        students.put(104, "Shantnu");

        System.out.println(students.get(102));
        System.out.println(students.containsKey(105));
        System.out.println(students.containsValue("Nikhil"));
        students.remove(103);
        System.out.println(students);

        for (Integer key : students.keySet()){
            System.out.println("Key : "+ key + " value: " + students.get(key));
        }

        Iterator<Map.Entry<Integer, String>> iterator =
                students.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key = "+ entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
