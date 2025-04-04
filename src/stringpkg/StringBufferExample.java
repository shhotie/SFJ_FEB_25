package stringpkg;

public class StringBufferExample {
    public static void main(String[] args) {
        // create object of Stringbuffer
        StringBuffer sb = new StringBuffer("Hello");
        //append
        sb.append(" World");
        sb.insert(5, "Java");
        sb.delete(5, 9);
        sb.reverse();
        System.out.println(sb);
    }
}
