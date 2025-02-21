package opratorpkg;

public class TernaryOperator {
    public static void main(String[] args) {
        // Syntax of a ternary operator
        /*
        condition ? expr1 : expr2

        if(true) { expr1 }
        else { expr2 }

         */

        int a = 20;
        int b = 10;
        int c = 30;
        int result;

        if(a > b){
            System.out.println("a is greater"); //expr1
        } else {
            System.out.println("b is greater");  //expr2
        }

        int max = (a > b) ? a : b;
        System.out.println("Greater no = " + max);

        int largest = c > max ? c : max;

        System.out.println("Greatest of three no largest = " + largest);



        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        //         cond       expr1            expr2
        System.out.println("Greatest of three no = " + result);
    }
}
