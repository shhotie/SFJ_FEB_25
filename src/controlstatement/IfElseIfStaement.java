package controlstatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseIfStaement {
    public static void main(String[] args) {
        /*
        if(condition1){
        // execute for condition1
        } elseif (condition2){
        // execute for condition2
        } else{
        // if all the given condition
        }
         */


        int score = 85;
        if(score >= 90){
            System.out.println("Grade-A");
        } else if (score >= 75) {
            System.out.println("Grade-B");
        } else if (score >= 60) {
            System.out.println("Grade-C");
        } else {
            System.out.println("Failed");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item");
        String item = scanner.nextLine();

        if(item.equalsIgnoreCase("Burger")){
            System.out.println("Price = 100");
        } else if (item.equalsIgnoreCase("Pizza")) {
            System.out.println("Price = 250");
        } else {
            System.out.println("Item Not Available");
        }

    }
}
