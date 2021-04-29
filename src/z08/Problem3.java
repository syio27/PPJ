package z08;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,6,3,6,8,2,9};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j] && i != j){
                    break;
                }
                if(i == j){
                    count++;
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
