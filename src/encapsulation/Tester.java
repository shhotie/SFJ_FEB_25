package encapsulation;

public class Tester {
    public static void main(String[] args) {
        Employee emp = new Employee();
        /*
        without encapsulation
        emp.name ="Hemlata";
        emp.age = 20;
        System.out.println(emp.name+ " " + emp.age);
         */

        emp.setName("Akshay");
        emp.setAge(19);

        System.out.println("Name = " + emp.getName());
        System.out.println("Age = " + emp.getAge());

    }
}
