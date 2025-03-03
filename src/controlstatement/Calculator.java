package controlstatement;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no = ");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator = +, -, *, /, %");
        char operator = sc.next().charAt(0);

        System.out.println("Enter 2st no = ");
        double num2 = sc.nextDouble();

        Operator op = null;

        switch (op){
            case ADD:
                System.out.println("Result = " + (num1 + num2));
                break;

            case SUBSTRACT:
                System.out.println("Result = " + (num1 - num2));
                break;

            case MULTIPLY:
                System.out.println("Result = " + (num1 * num2));
                break;

            case DIVIDE :
                System.out.println("Result = " + (num1 / num2));
                break;

            case MODULO:
                System.out.println("Result = " + (num1 % num2));
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
