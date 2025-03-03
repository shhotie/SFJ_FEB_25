package controlstatement;

public class ReturnStatement {
    /*
    return value;
    ==> End of execution of method and returns a value
     */

    public static int add(int a , int b){
        return a+b;
    }

    public static String withdraw(double balance, double amount){
        if(amount > balance){
            return "Insufficient Balance";
        } else {
            return "Withdrawal Successful";
        }
    }



    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println("Sum = " + sum);

        String s = withdraw(800, 5000);
        System.out.println(s);
    }

}
