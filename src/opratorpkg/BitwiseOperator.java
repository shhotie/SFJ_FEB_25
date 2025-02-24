package opratorpkg;

public class BitwiseOperator {
    /*
    & ==> both expr should be true
    | ==> any one expr should true
    ! ==> invert the value
    ^ ==> either one expr should true
    ~ ==> Bitwise Complement
    << ==> left shift
    >> ==> right shift
     */
    public static void main(String[] args) {
        int num1 = 12, num2 = 25, result;
        // Bitwise OR
        result = num1 | num2;
        System.out.println(result);

        //Bitwise AND
        result = num1 & num2;
        System.out.println(result);

        //Bitwise X-OR
        result = num1 ^ num2;
        System.out.println(result);

        //Bitwise Complement
        // 0 ==> 1
        // 1 ==> 0
        int num3 = 12;
        result = ~num3;
        // -(12 + 1) = -13
        System.out.println(result);

        int num4 = 2;
        // 2 bit left shift
        result = num4 << 2;
        System.out.println(result);

        int num5 = 8;
        result = num5 >> 2;
        System.out.println(result);

        int num6 = -8;
        result = num6 >> 2;
        System.out.println(result);
    }

}
