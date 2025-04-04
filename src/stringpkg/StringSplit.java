package stringpkg;

public class StringSplit {
    public static void main(String[] args) {
        String text = "Java is a fun programming language";
        String [] result = text.split(" ");
        for (String str : result){
            System.out.println(str + ", ");
        }
        for(int i =0; i < result.length; i++){
            System.out.print(result[i] + ", ");
        }

        String vowels ="a::b::c::d::e";
        String[] result1 = vowels.split("::");
        for (String str : result1){
            System.out.print(str + ", ");
        }

    }
}
