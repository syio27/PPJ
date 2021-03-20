package z04;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter three boolean " +
                "values (true or false) ");
        boolean a = sca.nextBoolean();
        boolean b = sca.nextBoolean();
        boolean c = sca.nextBoolean();
        sca.close();

        boolean allThree   = a && b && c;
        boolean exactlyOne = a && !(b || c) || b && !(a || c) || c && !(b || a);
        boolean exactlyTwo = (a && b && !c) || (c && b && !a) || (c && a && !b);
        boolean atLeastOne = a || b || c;
        boolean atLeastTwo = (a && b) || (a && c) || (c && b);

        System.out.println("a, b, c = " + a + ", " + b +
                ", " + c + "\nallThree:   " + allThree +
                "\nexactlyOne: " + exactlyOne +
                "\nexactlyTwo: " + exactlyTwo +
                "\natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);
    }
}
