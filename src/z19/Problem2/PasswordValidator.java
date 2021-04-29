package z19.Problem2;

import java.util.HashSet;
import java.util.Set;

public class PasswordValidator {

    public static boolean eightChars(char[] pass){
        if(pass.length >= 8){
            return true;
        }
        return false;
    }
    public static boolean sixDiffChars(char[] pass){
        Set<Character> set = new HashSet<>();
        for(Character c : pass){
            set.add(c);
        }
        if(set.size() >= 6){
            return true;
        }
        return false;
    }
    public static boolean atLeastOneD(char[] pass){
        for(Character c : pass){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;

    }
    public static boolean atLeastOneUP(char[] pass){
        for(Character c : pass){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
    public static boolean atLeastOneLO(char[] pass){
        for(Character c : pass){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }
    public static boolean atLeastNonAChar(char[] pass){
        for(Character c : pass){
            if(!Character.isLetterOrDigit(c)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] passwords = {
                "AbcDe93".toCharArray(),
                "A1b:A1b>".toCharArray(),
                "Ab:Acb<".toCharArray(),
                "abc123><".toCharArray(),
                "Zorro@123".toCharArray()
        };
        for(char[] chars : passwords){
            boolean OK = eightChars(chars) && sixDiffChars(chars) && atLeastOneD(chars)
                        && atLeastOneUP(chars) && atLeastOneLO(chars) && atLeastNonAChar(chars);
            System.out.println("checking " + String.valueOf(chars));
            if(!eightChars(chars)){
                System.out.println("Too short");
            }
            if(!sixDiffChars(chars)){
                System.out.println("Too few different characters");
            }
            if(!atLeastOneD(chars)){
                System.out.println("No digit");
            }
            if(!atLeastOneUP(chars)){
                System.out.println("No uppercase letter");
            }
            if(!atLeastOneLO(chars)){
                System.out.println("No lowercase letter");
            }
            if(!atLeastNonAChar(chars)){
                System.out.println("No non-alphanumeric character");
            }
            if(OK){
                System.out.println("OK");
            }
            System.out.println();
        }
    }
}
