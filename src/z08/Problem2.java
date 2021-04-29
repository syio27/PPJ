package z08;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int tmp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = tmp;
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}
