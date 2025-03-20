package basicprograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(num + " * " + i +" = " + (num * i));
            i++;
        } while (i <= 10);
        sc.close();
    }
}
