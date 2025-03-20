package interfaceExamples;

import java.io.Serializable;

public class Employee implements Serializable , Cloneable{
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
