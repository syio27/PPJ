package z12;

import java.util.Arrays;

public class Problem3 {
    public static int[][] inner(int[][] arr){
        int[][] innerArr = new int[arr.length-2][arr[0].length-2];
        for(int i=1; i<arr.length-1; i++){
            for(int j=1; j<arr[i].length-1; j++){
                innerArr[i-1][j-1] = arr[i][j];
            }
        }
        return innerArr;
    }

    public static void main (String[] args) {
                            /*j*/
        int[][] a = {/*i*/ {1,2,3,4,5,6,5,3},
                           {2,3,4,5,6,7,4,2},
                           {3,4,5,6,7,8,1,4},
                           {4,5,6,7,8,9,3,2},
                           {3,1,4,5,4,3,2,8},
                           {4,5,6,7,8,9,3,2} };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));
    }
}
