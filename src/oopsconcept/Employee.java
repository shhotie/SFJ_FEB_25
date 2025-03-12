package oopsconcept;

public class Employee {
    public Employee(String name){
        System.out.println("Hello " + name);
    }

    public Employee(String name, int age){
        System.out.println("Hello " + name + " and age  = " + age);
    }


    public Employee() {
        System.out.println("Default ctor called");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Shantanu");
        Employee e2 = new Employee();
        Employee e3 = new Employee("Megha", 18);


    }
}
