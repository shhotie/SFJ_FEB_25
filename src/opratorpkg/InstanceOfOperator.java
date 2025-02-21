package opratorpkg;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println( str instanceof String);

        Person obj1 = new Person();
        Person obj2 = new Boy();

        System.out.println(obj2 instanceof Person);
        System.out.println(obj2 instanceof Boy);
        System.out.println(obj2 instanceof MyInterface);
    }
}
