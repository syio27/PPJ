package z11;

import java.util.Arrays;

public class Problem2 {
    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] maxOfRows(int[][] arr){
        int[] maxRowArr = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            maxRowArr[i] = max(arr[i]);
        }
        return maxRowArr;
    }
    public static void main(String[] args) {
        int[][] arr = { {1,3,111}, {3,111,4,5,8}, {6,111,8}, {1,111,9,6} , {0,0,0,0}};
        int[] maxrowArr = maxOfRows(arr);
        System.out.println(Arrays.toString(maxrowArr));
    }
}
