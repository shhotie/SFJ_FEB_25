package oopsconcept;

public class Tester01 {
    public static void main(String[] args) {
        Car car = new Car();
//        car.model = "Tesla";
//        car.year = 2025;
//        car.display();
//        System.out.println(car.model);

        Student student1 = new Student(101, "Astha", 17);
//        student1.display();

        // calling copy ctor
        Student student2 = new Student(student1);
        student2.display();

        Student student3 = new Student(501);
    }
}
