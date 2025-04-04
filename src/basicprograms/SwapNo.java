package basicprograms;

public class SwapNo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a*b; //200
        b = a/b; // 200/20 = 10
        a = a/b; // 200/10 = 20


//        int c = a;
//        a=b;
//        b=c;
//        System.out.println("Value of a and b using temp variable = " + a + " " + b);

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        b = a+b - (a=b);
    }
}
