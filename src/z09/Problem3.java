package z09;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,5,3,1,3,7,8,4};
        int[] brr = {1,5,4,9,3,10,54}; // 1 5 4 3 (the order of printed values is irrelevant)
        for(int i=0; i<arr.length; i++)
        {
            for(int k=0; k<arr.length; k++){
                if(arr[i] == arr[k] && i!=k){ // checks if the same value is already printed
                    break;
                }
                if(i == k){
                    for(int j=0; j<brr.length; j++)
                    {
                        if(arr[i] == brr[j])
                        {
                            System.out.print(arr[i] + " ");
                        }
                    }
                }
            }
        }
    }
}
