package z10;

public class Problem1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][arr[i].length-1];
        }
        System.out.println(sum);
    }
}
