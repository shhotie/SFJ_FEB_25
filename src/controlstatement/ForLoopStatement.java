package controlstatement;

public class ForLoopStatement {
    public static void main(String[] args) {
       /*
        for(initialize; condition; increament/decreament){
        // code to execute
        }
        */

        for (int i =1; i<= 5; i++){
            System.out.println("Iteration: " + i);
        }

        for(int ticket = 1 ; ticket <= 10 ; ticket++){
            System.out.println("Printing Ticket no: " + ticket);
        }
    }
}
