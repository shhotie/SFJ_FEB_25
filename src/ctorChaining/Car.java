package ctorChaining;

public class Car {
    String brand;
    String model;
    int year;

    public Car() {
        this("Unknown Brand", "Unkhown Model", 0);
        System.out.println("Default ctor called");
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Parameterized ctor called");
    }

    void display(){
        System.out.println("Brand : "+ brand + " Model: " + model + " year: "+ year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.display();
    }
}
