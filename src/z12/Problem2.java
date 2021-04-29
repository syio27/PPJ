package z12;

import java.util.Arrays;

public class Problem2 {
    public static void swapMaxWithMin(int min, int max, int[] arr){
        int tmp = arr[min];
        arr[min] = arr[max];
        arr[max] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,4};
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                swapMaxWithMin(i,i+1,arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
