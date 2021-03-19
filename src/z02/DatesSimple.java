package z02;
public class DatesSimple {

    public static int tobit(String str){
        str = str.replace(' ', '0');
        System.out.println(str);
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number = (number << 1) | ((str.charAt(i) != '0') ? 1 : 0);
        }
        return number;
    }

    public static void main (String[] args) {
        int fromy = 2000, fromm =  2, fromd =  3;
        int   toy = 2127,   tom = 11,   tod = 29;

        System.out.println("**** Original\n" +
                "From " + fromy + "/" +
                fromm + "/" + fromd + " to " +
                toy + "/" + tom + "/" + tod);

        int period = 0;

        // ... (pack 6 numbers into 'period')
        String d = String.format("%0$5s", Integer.toBinaryString(fromd));
        String m = String.format("%0$4s", Integer.toBinaryString(fromm));
        String y = String.format("%0$23s", Integer.toBinaryString(fromy));

        String td = String.format("%0$5s", Integer.toBinaryString(tod));
        String tm = String.format("%0$4s", Integer.toBinaryString(tom));
        String ty = String.format("%0$23s", Integer.toBinaryString(toy));

        String str = y + m + d;
        String str1 = ty + tm + td;




        fromy = fromm = fromd = toy = tom = tod = 0;

        int number = tobit(str);
        int number1 = tobit(str1);

        String str2=String.format("%0$32s", Integer.toBinaryString(number)).replace(' ', '0');
        String str3=String.format("%0$32s", Integer.toBinaryString(number1)).replace(' ', '0');


        fromy = Integer.parseInt(str2.substring(0, 23), 2);
        fromm = Integer.parseInt(str2.substring(23,27), 2);
        fromd = Integer.parseInt(str2.substring(27,32), 2);

        toy = Integer.parseInt(str3.substring(0, 23), 2);
        tom = Integer.parseInt(str3.substring(23,27), 2);
        tod = Integer.parseInt(str3.substring(27,32), 2);



        System.out.println("**** Reconstructed\n" +
                "From " + fromy + "/" +
                fromm + "/" + fromd + " to " +
                toy + "/" + tom + "/" + tod);
    }
}