package z12;

public class Problem1 {
    public static boolean hasTwoRoots(double a, double b, double c) {
        return Math.pow(b,2) - 4 * a * c > 0 && a!=0;
    }
    public static boolean monot(double a, double b, double c) {
        return (a>b)&&(b>c);
    }
    public static double maxEl(double a, double b, double c) {
        return a > b && a > c ? a : b > c && b > a ? b : c;
    }
//    public static int numPos(double a, double b, double c) {
//        return
//    }

    public static void main(String[] args) {
        double a = 2, b = 3, c = 1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): hasTwoRoots? " +
                hasTwoRoots(a,b,c));
        a = 0; b = 2; c = 1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): hasTwoRoots? " +
                hasTwoRoots(a,b,c));

        a = 2; b = 1; c = -1;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): monot? " +
                monot(a,b,c));
        a = 2; b = 1; c = 2;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): monot? " +
                monot(a,b,c));

        a = 2; b = 1; c = 2;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): maxEl = " +
                maxEl(a,b,c));
        a = 2; b = 2; c = 4;
        System.out.println("(a, b, c,)=(" + a + ", " +
                b + ", " + c + "): maxEl = " +
                maxEl(a,b,c));

        a = -2; b = 1; c = -3;
//        System.out.println("(a, b, c,)=(" + a + ", " +
//                b + ", " + c + "): numPos = " +
//                numPos(a,b,c));
//        a = -2; b = 1; c = 3;
//        System.out.println("(a, b, c,)=(" + a + ", " +
//                b + ", " + c + "): numPos = " +
//                numPos(a,b,c));
    }
}