package z05;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
            for(int k = 1; k <= n; k++){
                System.out.printf("%4d", k*k);
            }
        }
    }
}
