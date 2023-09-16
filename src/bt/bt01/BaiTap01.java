package bt.bt01;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền usd cần chuyển đổi: ");
        int usd = input.nextInt();
        long vnd = 23000L * usd;

        System.out.println("Số tiền chuyển đổi sang VND là: " + vnd + "VND");
    }
}
