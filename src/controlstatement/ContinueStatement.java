package controlstatement;

public class ContinueStatement {
    public static void main(String[] args) {
        /*
         for(init ; codition ; ++/--){
            if(condition){
            continue;
     }
         */

        for (int i = 1; i <= 5; i++){
            if(i == 3) continue;
            System.out.println(i);
        }

        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        // length = 7 but index starts from 0
        for (int index =0 ; index < days.length; index++){
            if(days[index].equals("Sat") || days[index].equals("Sun")) continue;
            System.out.println("Work On : "+ days[index]);
        }
    }
}
