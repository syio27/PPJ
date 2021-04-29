package z13;

public class Problem4 {

    static void checkISBN(String isbn) {
        int sum = 0;
        int count = 0;
        int x = 10;
        int lastDigit = isbn.charAt(isbn.length() - 1) == 'X' ? 10 : Character.getNumericValue(isbn.charAt(isbn.length()-1));
        for(int i=0; i<isbn.length(); i++){
            if(!(isbn.charAt(i) == '-')){
                sum += isbn.charAt(i) == 'X' ? 10 * x : Character.getNumericValue(isbn.charAt(i)) * x;
                x--;
                count++;
            }
        }
        boolean checkedError = false;
        if(count > 10){
            System.out.println(isbn + ": ERROR. Too many digits");
            checkedError = true;
        }
        else if(count < 10){
            System.out.println(isbn + ": ERROR. Too few digits");
            checkedError = true;
        }

        if(!checkedError){
            for(int i=0; i<isbn.length()-1; i++){
                if(!(isbn.charAt(i) == '-')){
                    if(isbn.charAt(i) == 'X' || !(Character.isDigit(isbn.charAt(i)))){
                        System.out.println(isbn + ": ERROR. Invalid character " + isbn.charAt(i));
                        checkedError = true;
                    }
                }
            }
        }

        boolean isValid = sum % 11 == 0;
        if(isValid){
            System.out.println(isbn+": OK");
        }
        else if(!checkedError){
            sum -= lastDigit;
            for(int i=0; i<10; i++){
                if((sum + i+1) % 11 == 0){
                    System.out.println(isbn+": ERROR. Last digit should be " + (i+1));
                    break;
                }
            }
        }
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        String[] isbns = {
                "960-425-059-0", "80-902744-1-6", "85-359-0277-5",
                "0-8044-2958-X", "0-943396-04-2", "0-9752298-0-5",
                "9971-5-02l0-0", "93-8654--21-4", "99921-588-107",
        };

        for (int i = 0; i < isbns.length; ++i)
            checkISBN(isbns[i]);
    }
}
