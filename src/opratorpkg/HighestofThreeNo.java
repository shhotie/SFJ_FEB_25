package opratorpkg;

import java.util.Scanner;

public class HighestofThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no = ");
        int num1 = sc.nextInt(); // 10

        System.out.println("Enter second no = ");
        int num2 = sc.nextInt(); //20

        System.out.println("Enter third no = ");
        int num3 = sc.nextInt(); // 30

        // consider any no highest
        int highest = num1; // 10 //20

        if(num2 > highest){
            highest = num2;
        }

        if(num3 > highest){
            highest = num3;
        }

        System.out.println("Highest number = " + highest);
        sc.close();
    }
}
