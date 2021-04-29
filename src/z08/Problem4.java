package z08;

public class Problem4 {
    public static void swap(int max, int min, int[] arr){
        int tmp = arr[max];
        arr[max] = arr[min];
        arr[min] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, -2, 4, -2, 2, 4, 3};
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int maxIndex = 0;
        int minIndex = 0;
        int maxV = Integer.MIN_VALUE;
        int minV = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= maxV){
                maxV = arr[i];
                maxIndex = i;
            }
            if(arr[i] < minV) {
                minV = arr[i];
                minIndex = i;
            }
        }
        swap(maxIndex, minIndex, arr);
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i=arr.length-1 ; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
