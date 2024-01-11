package Arr;

import java.util.Scanner;

public class ViDuArr2 {
//    public static void main(String[] args) {
////        khởi tạo mảng 2 chiều vs 3 dòng và 4 cột
//        int[][] matrix = new int[3][4];
////        tham chiếu nhập vào từ màn hình
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap "+ matrix.length + " dong va " + matrix[0].length + " cot cua matrix:");
////        lặp qua hàng
//        for(int row = 0; row < matrix.length ; row++) {
////            mỗi lần lặp qua hàng sẽ lặp qua cột
//            for(int column = 0; column < matrix[row].length; column++) {
////             mỗi lần lặp trả về 1 input nhập liệu
//                matrix[row][column] = input.nextInt();
//            }
//        }
//        System.out.println("Xuat matrix co "+ matrix.length + " dong va " + matrix[0].length + " cot:");
//        for(int row = 0; row < matrix.length ; row++) {
//            for(int column = 0; column < matrix[row].length ; column++) {
////
//                System.out.print(matrix[row][column] + " ");
//            }
//            System.out.println();
//        }
//    }
//public static void main(String[] args) {
//    int[][] matrix = {
//            {1, 2, 3, 0},
//            {4, 5, 6, 9},
//            {7, 2, 5, 5}
//    };
//    //vòng lặp for-each đầu tiên truy cập đến mảng 1 chiều chứa các dòng
//    for (int[] innerArray: matrix) {
//        //vòng lặp for-each truy cập đến từng phần tử trong các dòng
//        for(int data: innerArray) {
//            System.out.print(data + " ");
//        }
//        System.out.println();
//    }
//}
public static void main(String[] args) {
    int[][] matrix = {
            {1, 2, 3, 0},
            {4, 5, 6, 9},
            {7, 2, 5, 5}
    };

    int total = 0;
    for(int row = 0; row < matrix.length; row++) {
        for(int column = 0; column < matrix[row].length; column++) {
            total += matrix[row][column];
        }
    }
    System.out.println("Tong cac phan tu trong matrix = " + total);


}
}
