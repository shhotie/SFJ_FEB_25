package arrayexamples;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int num1 =10, num2=20, num3=30, num4=40;
        /*
        Syntax =
        DataType[] arrayName ={separated by comma};
        DT arrayName[]
         */

        // 1. Direct Initialization
        int[] num = {10,20,30,40};

//        System.out.println(num[4]);
// ArrayIndexOutOfBoundsException
        int j=0;
        while (j < num.length){
            System.out.println(num[j]);
            j++;
        }
        do{
            System.out.println(num[j]);
            j++;
        }while (j < num.length);

        System.out.println(Arrays.toString(num));


        for (int i = num.length-1; i>=0; i--){
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.println(num.length);

        System.out.println(num[2]);
        System.out.println("Printing Array");
        for (int var : num){
            System.out.println(var);
        }
        System.out.println("Print array after modification");
        num[2]=100;
        for (int var : num){
            System.out.println(var);
        }

        // 2. Using new Keyword
        int[] numbers = new int[4];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;

        for(int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        for(int val : numbers){
            System.out.println(val);
        }



    }
}
