package z11;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        String[][] arr = { {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
                           {"Gambia", "Banjul"}, {"Ghana", "Accra"},
                           {"Niger", "Niamey"}, {"Zambia", "Lusaka"} };

        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter country to find out the capitat (stop to stop)");
        String country = sc.nextLine();
        while(!country.equals("stop")){
            for(int i=0; i<arr.length; i++){
                if(country.equals(arr[i][0])){
                    System.out.println(country + " capital is " + arr[i][1]);
                    found = true;
                }
            }
            if(!found){
                System.out.println(country + " didnt found");
            }
            System.out.println("Enter country to find out the capitat (stop to stop)");
            country = sc.nextLine();
        }
    }
}
