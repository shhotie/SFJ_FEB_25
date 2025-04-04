package stringpkg;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(3));

        String str1 = "Salesforce";
        String str2 = " Jungle";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        String str3 = "World";
        String str4 = "World";
        String str5 = new String("World");

        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str3.equals(str5));
        
    }
}
