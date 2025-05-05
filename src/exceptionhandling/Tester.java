package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {
    void checkAge(int age){
    if(age < 18){
        throw new ArithmeticException("Not eligible to vote");
    }
    }
    void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("data.txt");
    }
    public static void main(String[] args) {

        int age =19;
        Tester test = new Tester();
        test.checkAge(age);
        int num = 0;
        try {
            num = 10/0;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println(num);



        try {
            int arr [] = new int[2];
            arr[0]= 10;
            arr[1]= 20;
//            arr[10]= 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Error");
        }catch (RuntimeException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured.");
        }


        try {
            throw new MyException("Custom Exception Occured");
        } catch (MyException e) {
            throw new RuntimeException(e);
        }


    }
}
