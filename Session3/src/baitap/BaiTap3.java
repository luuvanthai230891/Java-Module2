package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap3 {
//    [Bài tập] Gộp mảng
    public static void main(String[] args) {
        int[] myNum1 = new int[5]; // khởi tạo mảng 1
        int[] myNum2 = new int[5]; // khởi tạo mảng 2
        int[] myNum3 = new int[10]; // khởi tạo mảng 3
        int i = 0; // biến condition
        int a = myNum2.length;
            for(i = 0; i < myNum1.length; i++){
                System.out.println("Nhap vao phan tu thu  " + (i + 1) + " cua mang 1:  ");
                myNum1[i] = new Scanner(System.in).nextInt();
                myNum3[i] = myNum1[i]; // gán phần tử mảng 1 cho mảng 3
            }
            for (i = 0; i < myNum2.length; i++){
                System.out.println("Nhap vao phan tu thu  " + (i + 1) + " cua mang 2:  ");
                myNum2[i] = new Scanner(System.in).nextInt();
                myNum3[a] = myNum2[i]; // gán phần tử mảng 2 cho mảng 3
                a++;
            }
        System.out.println("Mảng sau khi gộp là");
        System.out.println(Arrays.toString(myNum3));


    }

    public static int[] combineArray(int[] array1, int[] array2) {
        // Tạo mảng mới có kích thước là tổng kích thước của hai mảng
        int[] newArray = new int[array1.length + array2.length];

        // Sao chép các phần tử của mảng 1 vào mảng mới
        System.arraycopy(array1, 0, newArray, 0, array1.length);

        // Sao chép các phần tử của mảng 2 vào mảng mới
        System.arraycopy(array1, 0, newArray, array1.length, array2.length);

        return newArray;
    }
}
