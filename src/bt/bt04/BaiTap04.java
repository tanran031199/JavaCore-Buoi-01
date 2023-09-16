package bt.bt04;

import java.util.Scanner;

public class BaiTap04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float subjectsPoint = 0f;

        System.out.println("Nhập điểm số các môn học của bạn!!!");
        String[] subjects = {"Môn toán", "Môn lý", "Môn hóa", "Môn văn", "Môn anh"};

        for (String subject : subjects) {
            System.out.print(subject + ": ");
            float point = Float.parseFloat(sc.nextLine());
            if (point > 10 || point < 0) {
                System.out.println("Nhập sai điểm số!!! Xin mời nhập lại");
                return;
            }
            subjectsPoint += point;
        }

        float averagePoint = subjectsPoint / subjects.length;
        String formatAveragePoint = String.format("%.2f", averagePoint);
        System.out.println("Điểm trung bình các môn học của bạn là: " + averagePoint);


        if(averagePoint < 5) {
            System.out.println("Học lực yếu");
        } else if (averagePoint < 6.5) {
            System.out.println("Học lực trung bình");
        } else if (averagePoint < 8) {
            System.out.println("Học lực khá");
        } else if (averagePoint < 9) {
            System.out.println("Học lực giỏi");
        } else {
            System.out.println("Học lực xuất sắc");
        }
    }
}
