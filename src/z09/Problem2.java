package z09;

public class Problem2 {
    public int maxValueInArray(int[] arr){
        int max = 0;
        for(Integer i : arr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public void printHistogram(int rows, int[] arr){
        while(rows > 0){
            for(int i = 0; i < arr.length; i++){
                    if(arr[i] < rows) System.out.printf("%-2s"," ");
                    else System.out.printf("%-2s","*");
            }
            System.out.println();
            rows--;
        }
    }
    public static void main(String[] args) {
        Problem2 o = new Problem2();
        int[] arr = {4,1,6,2,8,4};
        o.printHistogram(o.maxValueInArray(arr), arr);
    }
}
