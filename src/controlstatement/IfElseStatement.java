package controlstatement;

public class IfElseStatement {
    public static void main(String[] args) {
        /*
        if(condition){
        // Execute code if condition is true
        } else{
        // Execute code if condition is false
        }
         */

        int marks = 75;
        double cartValue = 0;

        if(marks >= 40) {
            cartValue =1200;
        }

        if(cartValue >= 1000){
            System.out.println("Discount Applied");
        }else {
            System.out.println("NO Discount Available");
        }
    }
}
