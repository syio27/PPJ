package z04;

import java.util.Scanner;

public class Problem1 {

    public static String isOk(int a, int b, int c){
        return (a == b || a == c || b == c) && (a != b || a != c) ? "OK" : "not OK";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(isOk(a,b,c));
    }
}
