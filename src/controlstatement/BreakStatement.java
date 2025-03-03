package controlstatement;

public class BreakStatement {
    /*
    ** used inside loops only
    for(init ; codition ; ++/--){
    if(condition){
    break;
     }
    }
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            if(i == 3) break;
            System.out.println(i);
        }

        String[] items = {"Shoes", "Watch", "Phone", "Laptop"};
        for(int index= 0; index < items.length; index++){
            if(items[index].equals("Watch")){
                System.out.println("Item Found =" + items[index]);
                break;
            }
        }
    }
}
