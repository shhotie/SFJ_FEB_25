package opratorpkg;

import java.util.Scanner;

public class HighestofThreeNoLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no = ");
        int num1 = sc.nextInt(); // 10

        System.out.println("Enter second no = ");
        int num2 = sc.nextInt(); //20

        System.out.println("Enter third no = ");
        int num3 = sc.nextInt(); // 30

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is largest = "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is highest = " + num2);
        }else {
            System.out.println("num3 is highest = " + num3);
        }
    }
}
