package bt.bt03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        int cd = sc.nextInt();
        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        int cr = sc.nextInt();

        if (cd < cr) {
            System.err.println("Chiều dài lớn hơn chiều rộng!!! vui lòng nhập lại");
        } else {
            System.out.printf("Chu vi của hình chữ nhật là: %d \nDiện tích của hình chữ nhật là: %d",
                    (cd + cr) * 2,
                    cd * cr);
        }
    }
}
