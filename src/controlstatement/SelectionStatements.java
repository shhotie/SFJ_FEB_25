package controlstatement;

public class SelectionStatements {
    public static void main(String[] args) {
        // Simple if
        /*
        if(Condition){
        // code to execute if condition will be true
        }
         */
        // WAP to check whether the age is eligible to vote
        int age = 20;
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }

        // WAP to stop car if signal is RED
        String signal = "Red";
        if(signal.equalsIgnoreCase("RED")){
            System.out.println("Stop th car");
        }
    }
}
