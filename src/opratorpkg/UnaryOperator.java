package opratorpkg;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println("post-increament =" + (a++)); // print 10
        System.out.println("value pf a = "+ a); // a = 11
        System.out.println("pre-increament =" + (++b));  // print 11

        System.out.println("post-decreament =" + (a--)); // print 11
        System.out.println("value pf a = "+ a);  // a = 10
        System.out.println("pre-decreament =" + (--b));  // print 10

        if(!true){
            System.out.println("Loop ans = "+(a+b));
        } else {
            System.out.println("nothing");
        }
    }
}
