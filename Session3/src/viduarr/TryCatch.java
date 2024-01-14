package viduarr;

import java.util.Scanner;

public class TryCatch {
//    cac phan nhay cam de xay ra loi ngoai le khi dc nam trong try catch
//    se bao loi ma k dung chuong trinh
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n;
        try {
            System.out.println("Nhap vao so nguyen n");
            n = sc.nextInt();
        }catch (Exception e){
            System.out.println("Nhap du lieu k dung");
        } finally {
            System.out.println("finally");
        }

        System.out.println("gia tri nhap la");
        System.out.println("ket thuc ct");
    }
}
