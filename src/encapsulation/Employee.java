package encapsulation;

public class Employee {
//    String name;
//    int age;

    private String name;
    private int age;

    // getter method

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter method


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
