package z10;

public class Problem3 {
    public static int sumRow(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int sumColumn(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[j][i];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = { {1,3,2},
                        {3,4,8},
                        {2,6,8}};
        int sumR = 0;
        int maxR = 0;
        int maxRI = 0;
        for(int i=0; i<arr.length; i++){
            sumR = sumRow(arr[i]);
            if(sumR > maxR){
                maxR = sumR;
                maxRI = i;
                sumR = 0;
            }
        }
        int sumC = 0;
        int maxC = 0;
        int maxCI = 0;
        for(int i=0 ; i<arr.length; i++){
                sumC = sumColumn(arr);
                if(sumC > maxC){
                    maxC = sumC;
                    maxCI = i;
                    sumC = 0;
                }
        }
        System.out.println("Max sum index of row: " + maxRI);
        System.out.println("Max sum index of column: " + maxCI);
    }
}
