package z16.Problem2;

public class MyString {
    private String str;

    public MyString() {
        this.str = "";
    }

    public MyString(String str) {
        this.str = str;
    }
    public int getLength(){
        return str.length();
    }

    public char getChar(int n) throws IllegalAccessException {
        if(n > str.length() || n < 0){
            throw new IllegalAccessException();
        }
        return str.charAt(n);
    }

    public void append(String s){
        str += s;
    }
    public void append(int rep, String s){
        for(int i=0; i<rep; i++){
            str += s;
        }
    }
    public void prepend(String s){
        str = s + str;
    }
    public void insert(int pos, String s) throws IllegalAccessException {
        if (pos > str.length() || pos < 0) {
            throw new IllegalAccessException();
        }

        String substrFirst = str.substring(0, pos);
        String subLast = str.substring(pos);
        str = substrFirst + s + subLast;
    }
    public void reset(String s){
        int firstI = str.indexOf(s);
        int lastI = str.indexOf(s) + s.length();
        String substrFirst = str.substring(0, firstI);
        String subLast = str.substring(lastI);
        str = substrFirst + subLast;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "str='" + str + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        MyString string = new MyString("Baga");
        string.append(" sexy");
        System.out.println(string);
        System.out.println(string.getLength());
        try{
            System.out.println("CHAR AT INDEX: " + string.getChar(2));
        }catch (Exception e){
            System.out.println("ERROR. n cannot be less or more than length of string!");
        }
        string.append(2," yes");
        System.out.println(string);
        string.prepend("Saga ");
        System.out.println(string);
        try{
            string.insert(5, "Lol ");
            System.out.println(string);
        }catch (Exception e){
            System.out.println("ERROR. pos cannot be less or more than length of string!");
        }
        string.reset("Lol ");
        System.out.println(string);
    }
}
