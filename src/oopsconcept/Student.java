package oopsconcept;

public class Student {
    // field or instance var or state or properties or class member
    private int rollNo;
    private String name;
    private int age;

    public Student() {
        System.out.println("Default ctor called");
    }

    public Student (int rollNo){
        // Invoking current class Ctor
        this();
        this.rollNo = rollNo;
        System.out.println("Parameterized ctor called");
    }

    public Student(int rollNo, String n, int age){
//        rollNo = rollNo;
        // Referring to instance variable using this keyword
       this.rollNo = rollNo;
       // this.field = parameter
        name = n;
        this.age = age;
    }

    void show(){
        System.out.println("Printed");
    }

    // Copy Ctor
    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.rollNo = s.rollNo;
    }

    public void display(){
        // Invoking current class method
        this.show();
        System.out.println("Student name = " + name + " age = " + age + " rollNo = " + rollNo);
    }
}
