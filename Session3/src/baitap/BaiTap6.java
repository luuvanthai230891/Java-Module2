package baitap;

import java.util.Scanner;

public class BaiTap6 {
//    [*Bài tập] Tính tổng các số ở một cột xác định
    public static void main(String[] args) {
        int[][] maTrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Nhap vao so cot can tinh tong : ");
        int column = new Scanner(System.in).nextInt(); // Đổi giá trị này để tính tổng của cột khác

        // Gọi phương thức tính tổng cột và in kết quả
        int tongCot = sumOfElementInColumn(maTrix, column);
        System.out.println("Tổng của cột " + column + " là: " + tongCot);
    }

    // Phương thức tính tổng của một cột trong mảng 2 chiều
    public static int sumOfElementInColumn(int[][] maTrix, int column) {
        int sum = 0;

        // Duyệt qua từng dòng của mảng và cộng giá trị tại cột xác định
        for (int i = 0; i < maTrix.length; i++) {
            sum += maTrix[i][column];
        }

        return sum;
    }

}
