package ctorChaining;

public class Bike extends Vehicle {
    String brand;
    String color;

    public Bike(String type, String brand, String color) {
        super(type);
        this.brand = brand;
        this.color = color;
        System.out.println("Bike Ctor Called");
    }

    void display(){
        System.out.println("Type = " + type + ", Brand = " + brand + ", Color= " + color);
    }

    public static void main(String[] args) {
        Bike bike1 = new Bike("2 wheeler", "Honda", "Black");
        bike1.display();
    }
}
