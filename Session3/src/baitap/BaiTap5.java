package baitap;

import java.util.Scanner;

public class BaiTap5 {
//    [Bài tập] Tìm giá trị nhỏ nhất trong mảng
public static void main(String[] args) {
    System.out.print("Nhap vao so phan tu cua mang:");
    int size = new Scanner(System.in).nextInt(); // nhập độ dài mảng
    int[] array = new int[size]; // khởi tạo mảng
    int i = 0; // biến condition
    while (i < array.length) {
        System.out.print("Nhap phan tu so" + (i + 1) + " : ");
        array[i] = new Scanner(System.in).nextInt();
        i++;
    }
    System.out.println("Mang sau khi nhap phan tu la : ");
    for (int j = 0; j < array.length; j++) {
        System.out.print(array[j] + "\t");
    }
    System.out.println();
//in ra giá trị nhỏ nhất
    System.out.print("Gia tri nho nhat la " + findMinValue(array));
}
    public static int findMinValue(int[] array) {
        // Giả sử giá trị nhỏ nhất là phần tử đầu tiên của mảng
        int minValue = array[0];

        // Duyệt qua từng phần tử của mảng để tìm giá trị nhỏ nhất
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }
}
