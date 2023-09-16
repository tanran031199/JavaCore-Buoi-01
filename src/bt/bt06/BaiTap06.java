package bt.bt06;

import java.util.Scanner;

public class BaiTap06 {
    public static void main (String[] args) {
        String[] readNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        System.out.println("Input covert number 0-9");
        int number = new Scanner(System.in).nextInt();

        if(number > 9 || number < 0) {
            System.out.println("Number out of range 0-9");
            return;
        }

        System.out.println(readNumbers[number]);
    }
}
