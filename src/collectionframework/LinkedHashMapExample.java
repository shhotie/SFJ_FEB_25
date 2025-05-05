package collectionframework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "Vidhi");
        students.put(102, "Preksha");
        students.put(103, "Gaurav");
        students.put(104, "Shantnu");

        for (Integer key : students.keySet()){
            System.out.println("Key = " + key + " value = "+ students.get(key));
        }

        System.out.println(students.get(103));
        System.out.println(students.containsKey(105));
        System.out.println(students.containsValue("Gauraw"));
        students.remove(101);
        System.out.println(students);

        Iterator<Map.Entry<Integer, String>> iterator =
                students.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
        }

    }
}
