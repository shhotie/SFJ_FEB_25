package stringpkg;

public class StringInternMethod {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("Before Intern Method = "+ (str1 == str2));
        // == checks memory address

        // intern method is used to put string in SCP
        str1 = str1.intern();
        str2 = str2.intern();
        // both str1 and str2 have same memory address
        System.out.println("After intern method = " + (str1 == str2));

    }
}
