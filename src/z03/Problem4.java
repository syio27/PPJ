package z03;

import java.util.Scanner;

public class Problem4 {

    public static int difBetween(int a, int b, int c, int d){
        int diff = 0;
        int max = a;
        int min = a;

        if(max < a){
            max = a;
        }
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(max < d){
            max = d;
        }


        if(min > a){
            min = a;
        }
        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }

        System.out.println(max + " " + min);

        diff = max - min;

        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(difBetween(a, b, c, d));
    }
}
