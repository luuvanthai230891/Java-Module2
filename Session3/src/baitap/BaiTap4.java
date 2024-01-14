package baitap;

import java.util.Scanner;

public class BaiTap4 {
//    [Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều
    public static void main(String[] args) {
        int x, y; // khởi tạo dòng và cột của ma trận

        System.out.println("Nhập vào số dòng của ma trận");
        x = new Scanner(System.in).nextInt();

        System.out.println("Nhập vào số cột của ma trận");
        y = new Scanner(System.in).nextInt();

        float maTrix[][] = new float[x][y]; // khởi tạo ma trận

        System.out.println("Nhập các phần tử cho ma trận: ");
        for(int i = 0;i < x;i++){ // lặp qua hàng
            for(int j = 0; j < y; j++){ //lặp qua cột
                System.out.print("maTrix[" + i +  "][" + j + "] =");
                maTrix[i][j] = new Scanner(System.in).nextFloat(); // nhập vào giá trị theo tọa độ x, y
            }
        }

        float maxValue = maTrix[0][0]; // khởi tạo biến lớn nhất
        int rowIndex = 0;
        int columnIndex = 0;
        // Duyệt qua từng hàng và cột của ma trận
        for (int i = 0; i < maTrix.length; i++) { // lặp qua hàng
            for (int j = 0; j < maTrix[i].length; j++) { // lặp qua cột
                // So sánh và cập nhật nếu phần tử hiện tại lớn hơn
                if (maTrix[i][j] > maxValue) {
                    maxValue = maTrix[i][j];
                    rowIndex = i; // tọa độ dòng
                    columnIndex = j; //tọa độ cột
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là : " + maxValue + " tại ví trị maTrix["+ rowIndex +"]["+ columnIndex +  "] " );

    }
}
