package z14.Problem2;

import java.util.Arrays;

public class StringCmp {
    public static boolean isLess(String s1, String s2){
        if(s1.length() < s2.length()){
            return true;
        }
        else if(s1.length() == s2.length()){
            return s1.compareTo(s2) < 0;
        }
        return false;
    }

    public static void sortSel(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            int less_index = i;
            for(int j = i+1; j<arr.length; j++){
                if(isLess(arr[j], arr[less_index])){
                    less_index = j;
                }
            }
            String temp = arr[less_index];
            arr[less_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main (String[] args) {
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));

    }
}
