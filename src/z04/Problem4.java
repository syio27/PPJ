package z04;

import java.util.Scanner;

public class Problem4 {

    public static String family(String family) {
        int decimal = 0;
        for (int i = family.length() - 1, k = 0; i >= 0; i--, k++) {
            decimal += Math.pow(2, k) * Integer.parseInt(String.valueOf(family.charAt(i)));
        }
        //System.out.println(decimal);
        if (decimal == 0) {
            return "Courier";
        } else if (decimal == 1) {
            return"Times";
        } else if (decimal == 2) {
            return "Arial";
        } else
            return "Helvetica";

    }

    public static String style(String style) {
        int decimal = 0;
        for (int i = style.length() - 1, k = 0; i >= 0; i--, k++) {
            decimal += Math.pow(2, k) * Integer.parseInt(String.valueOf(style.charAt(i)));
        }
        //System.out.println(decimal);
        if (decimal == 0) {
            return "plain";
        } else if (decimal == 1) {
            return "italic";
        } else if (decimal == 2) {
            return "oblique";
        } else
            return "undefined (illegal)";

    }

    public static String weight(String weight) {
        int decimal = 0;
        for (int i = weight.length() - 1, k = 0; i >= 0; i--, k++) {
            decimal += Math.pow(2, k) * Integer.parseInt(String.valueOf(weight.charAt(i)));
        }
        //System.out.println(decimal);
        if (decimal == 0) {
            return "normal";
        } else
            return "bold";

    }

    public static String size(String size) {
        int decimal = 0;
        for (int i = size.length() - 1, k = 0; i >= 0; i--, k++) {
            decimal += Math.pow(2, k) * Integer.parseInt(String.valueOf(size.charAt(i)));
        }
        //System.out.println(decimal);
        if (decimal == 0) {
            return"x-small";
        } else if (decimal == 1) {
            return"small";
        } else if (decimal == 2) {
            return"medium";
        } else if (decimal == 3) {
            return"large";
        } else if (decimal == 4) {
            return"x-large";
        } else
            return "undefined (illegal)";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // decimal to 8 bit binary
        String result = "00000000";
        int i = result.length() - 1;
        while (x != 0) {
            char a[] = result.toCharArray();
            a[i--] = String.valueOf(x % 2).charAt(0);
            result = new String(a);
            x = x / 2;

        }

        String family = result.substring(result.length() - 2);
        String style = result.substring(result.length() - 4, result.length() - 2);
        String weight = result.substring(result.length() - 5, result.length() - 4);
        String size = result.substring(result.length() - 8, result.length() - 5);

        if(size(size).equals("undefined (illegal)")){
            System.out.println("illegal size");
        }
        else if(style(style).equals("undefined (illegal)")){
            System.out.println("illegal style");
        }
        else{
            System.out.println(family(family));
            System.out.println(style(style));
            System.out.println(weight(weight));
            System.out.println(size(size));
        }
    }
}
