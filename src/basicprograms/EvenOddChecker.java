package basicprograms;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a Number or type 'exit' to quit : ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("GoodBye!!");
                break;
            }
            try {
                int num = Integer.parseInt(input);
                if(num % 2 == 0){
                    System.out.println(num + " is an even number");
                }else {
                    System.out.println(num + " is an odd number");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input !! Please enter valid number");
            }

        }
        sc.close();
    }
}
