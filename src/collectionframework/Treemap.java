package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Vidhi");
        students.put(103, "Gaurav");
        students.put(104, "Shantnu");
        students.put(105, "Mohit");
        students.put(102, "Preksha");
        students.put(null, "Akshay");

        Map<Integer, String> map = new TreeMap<>();
                map.putAll(students);
        System.out.println("Elements of map");
        System.out.println(map);


        System.out.println(students);

        System.out.println(students.size());
        System.out.println(students.firstEntry());
        System.out.println(students.firstKey());
        System.out.println(students.floorKey(105));
        System.out.println(students.ceilingKey(104));


    }
}
