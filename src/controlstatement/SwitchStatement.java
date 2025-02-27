package controlstatement;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        /*
        switch(variable){
        case value1 :
        // code for case1
        break;

        case value2 :
        //code for case2
        break;

        default:
        // code if no case matches

        }
         */

//        int day = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int day = sc.nextInt();
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }
}
