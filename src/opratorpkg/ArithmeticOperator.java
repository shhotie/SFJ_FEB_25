package opratorpkg;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        // wrapping var a into obj1
        Integer obj1 = Integer.valueOf(a);
        System.out.println(obj1);

        String n1 = "15";
        String n2 = "25";

        // convert String into integers
        int a1 = Integer.parseInt(n1);
        int a2 = Integer.parseInt(n2);
        System.out.println("a1 - a2 = " + (a1 - a2));
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));  // Remainder

        double money = 22.55;
        Double d = Double.valueOf(money);



    }
}
