package z09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;
        int b;
        //arr[0] = (int) (Math.random()*(NUMS-1)) + 1;
        for(int i=0; i<SIZE; i++){
            b = (int) (Math.random()*(NUMS-1)) + 1; // [1,NUMS];
            arr[i] = b;
            counter++;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    counter++;
                    i--; // if duplicate finds run outer loop
                    break;
                }
            }
        }
        System.out.println("\nWith SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
