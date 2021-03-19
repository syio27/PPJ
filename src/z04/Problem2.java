package z04;

import java.util.Scanner;

public class Problem2 {
    public static String isOk(int a, int b , int c){
        return a + b > c || a + c > b || b + c > a ? "OK" : "not OK";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isOk(a,b,c));
    }
}
