package baitap;

import java.util.Scanner;

public class BaiTap7 {

//    Bài tập: tính tổng của đường chéo chính trong mảng 2 chiều vuông
    public static void main(String[] args) {
        int row, column; // khởi tạo hàng và cột của mảng

        System.out.println("Nhap vao so dong cua ma tran");
        row = new Scanner(System.in).nextInt(); // nhập vào hàng

        System.out.println("Nhap vao so cot cua ma tran");
        column = new Scanner(System.in).nextInt(); // nhập vào cột

        int maTrix[][] = new int[row][column]; // khởi tạo mảng

        System.out.println("Nhap cac phan tu cho matrix: ");
        for(int i = 0;i < row;i++){
            for(int j = 0; j < column; j++){
                System.out.print("maTrix[" + i +  "][" + j + "] =");
                maTrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Tong cac phan tu duong cheo chinh la : " + sumOfDiagonalInMatrix(maTrix));
    }

    // Phương thức tính tổng của đường chéo chính trong mảng 2 chiều vuông
    public static int sumOfDiagonalInMatrix(int[][] maTrix) {
        int sum = 0;

        // Duyệt qua từng dòng của ma trận và cộng giá trị tại vị trí có chỉ số dòng bằng chỉ số cột
        for (int i = 0; i < maTrix.length; i++) {
            sum += maTrix[i][i];
        }

        return sum;
    }
}
