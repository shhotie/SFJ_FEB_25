package polymorphism;

public class MathsOperation {
    /*
    ==> method overloading is possible in same class
    ==> Compile time or static
    Rules of O/L
    1. method must have same name
    2. method must have different parameter list
    3. return type does not differentiate o/loaded methods
     */
    // method to add two numbers
    public int add(int a, int b){
        return a+b;
    }

    // method to add three numbers
    public int add(int a, int b, int c){
        return a+b+c;
    }

    // method to add two double numbers
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MathsOperation obj = new MathsOperation();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(40.5, 20.5));
        System.out.println(obj.add(10, 20, 30));
    }
}
