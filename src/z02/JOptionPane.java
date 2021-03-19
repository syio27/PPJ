package z02;

import java.util.Scanner;

public class JOptionPane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double D = Math.pow(b,2) - 4*a*c;
        if(Math.sqrt(D) > 0){
            double x1 = (Math.pow(b,2) - Math.sqrt(D)) / 2 * a;
            double x2 = (Math.pow(b,2) + Math.sqrt(D)) / 2 * a;
            System.out.println("First point:" + x1);
            System.out.println("Secont point:" + x2);
        }
        else
            System.out.println("no real points");
    }
}
