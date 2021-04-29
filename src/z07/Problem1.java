package z07;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value or 0 to stop");
        int count = 0, x = sc.nextInt(),
        previous = 0, save_count = 0, save_x = 0, save = 0;

        while(x != 0){
            if(save == x){
                count++;
                if(count > save_count){
                    previous = x;
                }
            }
            if(x != save){
                save = x;
                count = 1;
            }
            if(count > save_count){
                save_count = count;
                save_x = previous;
            }
            x = sc.nextInt();
        }
        System.out.println(save_count + " times " + save_x);
    }
}
