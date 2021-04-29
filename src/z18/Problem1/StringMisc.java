package z18.Problem1;

import java.util.Locale;

public class StringMisc {
    public static String norm(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static String init(String name) {
        String[] str = name.split(" ");
        if(str.length == 3){
            return  str[0].substring(0,1).toUpperCase() + ". " +
                    str[1].substring(0,1).toUpperCase() + ". " +
                    norm(str[2]);
        }
        else{
            return  str[0].substring(0,1).toUpperCase() + ". " +
                    norm(str[1]);
        }
    }
    public static String tr(String s, String from, String to) {
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<from.length(); j++){
                if(arr[i] == from.charAt(j)){
                    arr[i] = to.charAt(j);
                }
            }
        }
        return String.valueOf(arr);
    }

    public static void main (String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));

        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));

        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
}
