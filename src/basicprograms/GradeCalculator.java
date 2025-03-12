package basicprograms;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        switch (marks/10){
            case 10:
            case 9:
                System.out.println("Grade : A");
                break;
            case 8:
                System.out.println("Grade : B");
                break;
            case 7:
                System.out.println("grade : C");
                break;
            case 6:
                System.out.println("Grade : D");
                break;
            default:
                System.out.println("Grade : F");
                break;
        }
        sc.close();
    }
}
