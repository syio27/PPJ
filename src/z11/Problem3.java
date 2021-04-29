package z11;

public class Problem3 {

    public static int[] oddAndEven(int[][] arr){
        int[] arrofEvenOdd = {0,0};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    arrofEvenOdd[0]++;
                }
                else
                    arrofEvenOdd[1]++;
            }
        }
        return arrofEvenOdd;
    }
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5}, {1,9}, {3,1,8} };
        int[] arrofEvenOdd = oddAndEven(arr);
        System.out.println("Even: " + arrofEvenOdd[0] + ", Odd: " + arrofEvenOdd[1]);
    }
}
