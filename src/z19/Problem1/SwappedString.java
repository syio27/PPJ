package z19.Problem1;

public class SwappedString {

    public static String swap(String s){
        if(s.length() % 2 != 0){
            throw new IllegalArgumentException("Provided string shoukd be even length");
        }
        String swapped = s.substring(s.length() / 2) + s.substring(0, s.length() / 2);
        return swapped;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(swap(str));
    }
}
