package z03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] A = {2, 4};
        int[] B = {1, 6};

        System.out.println("Interval A = " + Arrays.toString(A));
        System.out.println("Interval B = " + Arrays.toString(B));

        System.out.println("x in A: " + (x >= A[0] && x <= A[1]));
        System.out.println("x in B:  " + (x >= B[0] && x <= B[1]));
        System.out.println("x in A-B: " + ((x >= A[0] && x <= A[1]) && !(x >= B[0] && x <= B[1])));
        System.out.println("x in B-A: " + (!(x >= A[0] && x <= A[1]) && (x >= B[0] && x <= B[1])));
        System.out.println("x in intersection of A and B: " + ((x >= A[0] && x <= A[1]) && (x >= B[0] && x <= B[1])));
        System.out.println("x in union of A and B: " + ((x >= A[0] && x <= A[1]) || (x >= B[0] && x <= B[1])));
        System.out.println("x in symm. diff. of A and B: " + ((x >= A[0] && x <= A[1]) || (x >= B[0] && x <= B[1])));


    }
}
