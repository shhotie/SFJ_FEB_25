package controlstatement;

import java.util.Scanner;

public class CustomerServiceChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Option");
        int option = sc.nextInt();

        switch (option){
            case 1 :
                System.out.println("Checking Acc Balance");
                break;

            case 2:
                System.out.println("Transferring Money");
                break;

            case 3:
                System.out.println("Exiting App");
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}
