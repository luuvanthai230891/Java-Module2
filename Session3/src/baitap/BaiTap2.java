package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2 {
//    [Bài tập] Thêm phần tử vào mảng
    public static void main(String[] args) {
        int[] myNum = {1,2,12,34,5,7,10,50,41,49,52}; // khởi tạo mảng
        System.out.println("Nhap vao phan tu can thêm: ");
        int newElement = new Scanner(System.in).nextInt(); //phần tử cần thêm mới
        System.out.println("Nhập vào vị trí cần thêm : ");
        int index_add = new Scanner(System.in).nextInt(); // vị trí cần thêm mới
        if (index_add == -1 && index_add >= myNum.length - 1)
            System.err.println("Không chèn được phần tử vào mảng");
        System.out.println(Arrays.toString(addElement(myNum, newElement, index_add))); // gọi phương thức thêm mới
    }

    // Phương thức thêm phần tử vào mảng
    public static int[] addElement(int[] array, int newElement, int index_add) {
        int[] newArray = new int[array.length + 1];// khởi tạo mảng mới có chiều dài bằng chiều dài mảng cũ + số lượng phần tử thêm mới

        System.arraycopy(array, 0, newArray, 0, index_add);// sao chép phần mảng trc khi thêm phần tử

        newArray[index_add] = newElement;// gán phần tử mới vào vị trí cần thêm trong mảng

        System.arraycopy(array, index_add, newArray, index_add + 1, array.length - index_add);// sao chép phần còn lại của mảng

        return newArray; //trả về mảng mới sau khi thêm phần tử
    }

}
