package dataType;

public class BooleanDataType {
    // voting if age =18
    public boolean checkAge(int age){
        if(age >= 18){
          return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int age = 17;
        BooleanDataType bool = new BooleanDataType();
        System.out.println(bool.checkAge(age));
    }

}
