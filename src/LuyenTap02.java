import java.util.Date;
import java.util.Scanner;

public class LuyenTap02 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Nhập số tiền usd cần chuyển đổi: ");
//        int usd = input.nextInt();
//        int vnd = usd * 23000;
//        System.out.println("Số tiền được chuyển đổi thành VND là: " + vnd);

        /* souf in Nối chuỗi
         System.err.println("Đây là lỗi");
         System.out.println("\u001B[31mRed textfdfd");
         System.out.println("\u001B[32mGreen text");
         System.out.println("\u001B[33mYellow text");
         System.out.println("\u001B[34mBlue text");
         System.out.println("\u001B[35mPurple text");
         System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️"); */
        System.out.println("\u001B[36m");

        // Biến và kiểu dữ liệu

        // kiểu nguyên thủy
        // Cú pháp [kiểu dữ liệu] [tên biến] = [giá trị];
        int number = 10;
        float fl = 5.9f;
        double db = 10.0;
        char ch = 'a';
        boolean check = true;
        // Nếu giá trị là chuỗi dùng %s, số nguyên dùng %d
        // Nếu là số thực dùng %f, nếu là các kiểu khác mặc định là %s
        // Các ký tự đặc biệt \n - xuống dòng, \t - tab
        System.out.printf("number = %-5d  | fl = %-5.2f  | db = %5.2f  | ch = %s  | check = %-10s\n", number, fl, db, ch, check);

        // Kiểu tham chiếu
        String name = "Hồ Xuân\" Hương"; // char[] khi thay đổi giá trị của 1 chuỗi thì tạo ra 1 mảng kí tự mới
        String str = name;
        name = "nam";
        Date date = new Date();
        System.out.println("Ngày tháng hiện tại là: " + date);
        System.out.println("Họ tên: " + name);
        System.out.println(str);
        //Scanner sc = new Scanner(System.in); // Đây là máy quét dùng để nhập dữ liệu từ màn hình console
        // Nhập chuỗi, số, số thực, boolean, byte,...
//        System.out.println("Hãy nhập vào địa chỉ:");
//        String address = sc.nextLine();
//        System.out.println("Địa chỉ: " + address);

        // Nhập số
        // System.out.println("Hãy nhập vào 1 số :");
        // int a = sc.nextInt();
        // System.out.println("Số bạn vừa nhập là: " + a);
        // Lưu ý: khi vừa nhập số mà chuyển qua nhập chuỗi sẽ bị nuốt dòng
        // System.out.println("Hãy nhập vào 1 chuỗi:");
        // sc.nextLine();
        // String string = sc.nextLine();

        // Khai báo hằng
        // final float PI = 3.14f;

        //toán tử
        // -- ++ dùng để giảm hoặc tăng giá trị của biến 1 đơn vị
        // tiền tố: ++a hoặc --a : biểu thức này sẽ trả về giá trị của biến sau khi tăng hoặc giảm
        int x = 10;
        System.out.println(--x);
        // hậu tố: a++ hoặc a-- : biểu thức này sẽ trả về giá trị của biến trước khi tăng hoặc giảm
        System.out.println(x++);
        System.out.println(x);

        // Toán tử 3 ngôi
        // (biểu thức logic) ? (nếu đúng) : (nếu sai);
        // kiểm tra 1 số người dùng nhập vào là chẵn hay lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số: ");
        int n = sc.nextInt();
        String rs = (n % 2 == 0) ? "Số chãn" : "Số lẻ";
        System.out.println(rs);

        // Câu lệnh điều kiện
        // chỉ có if
        if (true) {
            System.out.println("Thực hiện if");
        }

        // if ... else
        if (n % 2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println("Số lẻ");
        }

        // bậc thang
        float dtb = 7.0f;

        if (dtb < 5.0) {
            System.out.println("yếu");
        } else if (dtb < 6.5) {
            System.out.println("Trung bình");
        } else if (dtb < 7) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }

        // lồng nhau
        // năm nhuận
        System.out.println("Nhập số năm: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm nhuận");
                }
                System.out.println("Không nhuận");
            } else {
                System.out.println("Năm nhuận");
            }
        } else {
            System.out.println("Không nhuận");
        }
    }
}
