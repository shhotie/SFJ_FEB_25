package controlstatement;

public class DoWhileLoopStatement {
    public static void main(String[] args) {
        /*
        do{
        // code to execute at least once
        } while (condition);
         */

        int num = 1;
        do{
            System.out.println("Number = " + num);
            num++; // num = num + 1
        } while (num <= 5);

        int pin = 1234;
        int enteredPin;

        do{
            System.out.println("Enter your pin");
            enteredPin = 1234;
        } while(enteredPin != pin);
        System.out.println(" Access Granted !!!");
    }
}
