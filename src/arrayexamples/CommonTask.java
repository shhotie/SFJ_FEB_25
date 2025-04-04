package arrayexamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CommonTask {
    public static void main(String[] args) {
        // sort array
        Integer[] arr = {70,90,10,25,34};
//        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array after sorting "+ Arrays.toString(arr));


        // Find sum of all elements in the array
        int[] num = {10,20,30,40};
        int sum =0;
        for (int var : num){
            sum+= var;
        }
        System.out.println(sum);

        // Find Max no from the array
        // Use simple for loop
        int max = num[0];
        for (int i =1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Max no = " + max);
    }
}
