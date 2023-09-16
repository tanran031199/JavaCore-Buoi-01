package bt.bt05;

import java.util.Scanner;

public class BaiTap05 {
    public static void main (String[] args) {
        int number = new Scanner(System.in).nextInt();

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " chia hết cho 3 và chia hết cho 5");
        } else if(number % 3 == 0) {
            System.out.println(number + " chia hết cho 3");
        } else if(number % 5 == 0) {
            System.out.println(number + " chia hết cho 5");
        } else {
            System.out.println(number + " không chia hết cho 3 và 5");
        }
    }
}
