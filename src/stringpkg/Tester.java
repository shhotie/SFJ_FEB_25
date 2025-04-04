package stringpkg;

public class Tester {
    public static void main(String[] args) {
        // Creating string by java literal stored in SCP
        String s1 = "java";

        // Creating string by using new keyword stored in heap
        String s2 = new String("tutorial");

        // converting character array to string
          /*
        syntax to create array
        dataType[] var_name = {data};
         */
        char[] ch ={'s', 't', 'r', 'i', 'n', 'g'};
        String s3 = new String(ch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String str1 = "Sanjeev";
        str1.concat("  Singh");
        System.out.println(str1);
        // it will print only Sanjeev bcz string is immutable
        // we have to explicitly assign it
        str1 = str1.concat(" Singh");
        System.out.println(str1);
    }
}
