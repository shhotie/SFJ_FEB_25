package opratorpkg;

public class LogicalOperator {
    public static void main(String[] args) {
        // && operator
        System.out.println((5>3) && (8>5));
        System.out.println((5>3) && (8<5));

        // || operator
        System.out.println((5<3) || (8>5));
        // false || true ==> true
        System.out.println((5>3) || (8<5));
        System.out.println((5<3) || (8<5));

        // ! operator
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
        System.out.println(! true);
        System.out.println(!(8==3)); // true

        // ^ operator (x-or)
        System.out.println((5<3) ^ (8>5));
        // false || true ==> true
        System.out.println((5>3) ^ (8>5));
        // true ^ true ==> false
        System.out.println((5<3) ^ (8<5));
        // false ^ false ==> false
    }
}
