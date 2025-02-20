package opratorpkg;

public class AssignmentOperator {
    public static void main(String[] args) {
        int f = 7;

        System.out.println("f += 3 = "+ (f += 3));
        // f = 10
        System.out.println("f -= 2 = " + (f -= 2));
        // f = 8
        System.out.println("f *= 2 = " + (f *= 2));
        // f = 16
        System.out.println("f /= 2 = " + (f /= 2));
        // f = 8
        System.out.println("f %= 2 = " + (f %= 2));
        // f = 0
    }
}
