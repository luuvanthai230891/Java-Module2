package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
//    [Bài tập] Xoá phần tử khỏi mảng
    public static void main(String[] args) {
        int[] myNum = {1,2,12,34,5,7,10,50,41,49,52};// khởi tạo mảng

        System.out.println("Nhap vao phan tu can xoa: ");
        int x = new Scanner(System.in).nextInt(); // nhập phần tử cần xóa

        System.out.println("Mang sau khi xoa la: ");
        System.out.println(Arrays.toString(deleteElement(myNum,x))); //gọi phương thức xóa và in ra mảng mới
}
    public static int[] deleteElement(int[] array, int elementDelete) {
        // Xác định vị trí của phần tử cần xóa
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementDelete) {
                index_del = i;
                break;
            }
        }
        // Kiểm tra xem phần tử cần xóa có tồn tại không
        if (index_del != -1) {
            //Tạo mảng mới có độ dài bằng mảng cũ sau khi đã xóa
            int[] newArr = new int[array.length - 1];
            //  Chép các phần tử không bao gồm phần tử cần xóa
            System.arraycopy(array, 0, newArr, 0, index_del);// sao chép mảng trc chỉ mục cần xóa
            System.arraycopy(array, index_del + 1, newArr, index_del, array.length - 1 - index_del);// sao chép mảng sau chỉ mục cần xóa
            //  Trả về mảng mới
            return newArr;
        } else {
            // Nếu phần tử cần xóa không tồn tại, trả về mảng ban đầu
            return array;
        }
    }
}