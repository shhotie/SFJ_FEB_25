package controlstatement;

import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Simple Calculator");

            System.out.println("Enter 1st no = ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter 2st no = ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose Operations");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");

            System.out.println("Enter your choice = ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Result = " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("Result = " + (num1 % num2));
                    break;

                default:
                    System.out.println("Invalid choice !! Please select valid operation");
                    continue;
            }
            System.out.println("Do you want to perform any other operation? (Y / N) :");
            String again  = scanner.next();
            if(again.equals("N") || again.equals("n")){
                System.out.println("Thank you for using calculator");
                break;
            }
        }
        scanner.close();
    }
}
