package z10;

public class Problem2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {1,2,3},
                       {1,2,3}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
