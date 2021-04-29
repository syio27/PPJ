package z14.Problem1;

public class FuncStat {
    public static int fiboR(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fiboR(n - 1) + fiboR(n - 2);
    }
    public static int fiboI(int n){
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
    public static int factR(int n){
        if (n == 0)
            return 1;
        else
        return(n * factR(n-1));
    }
    public static int factI(int n){
        int product = 1;
        for ( int j=1; j<=n; j++ )
            product *= j;
        return product;
    }
    public static int gcdR(int a, int b){
        if (b == 0)
            return a;

        return gcdR(b, a % b);
    }
    public static int gcdI(int a, int b){
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int maxElem(int[] arr, int from){
        if(arr.length - 1 == from){
            return arr[from];
        }
        return Math.max(arr[from+1], maxElem(arr, from+1));
    }
    public static int numEven(int[] arr, int from){
        if(arr.length == from){
            return 0;
        }
        int result;
        if(arr[from] % 2 == 0){
            result = 1;
        }
        else
            result = 0;

        return result + numEven(arr, from + 1);
    }
    public static void reverse(int[] arr, int from){
        reverseArray(arr, from , arr.length-1);
    }
    public static void reverseArray(int[] arr, int from, int to){
        if(from < to){
            int tmp = arr[from];
            arr[from] = arr[to];
            arr[to] = tmp;
            reverseArray(arr, ++from, --to);
        }
    }
    public static boolean isPalindrom(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrom(s.substring(1, s.length()-1));
        return false;
    }
}
