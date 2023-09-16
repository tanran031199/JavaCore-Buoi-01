import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên của bạn: ");
        String name = input.nextLine();

        System.out.println("Xin chào " + name);
    }
}