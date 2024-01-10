package baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner chieuDai = new Scanner(System.in);
        Scanner chieuRong = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai ");
        float chieuDaiValue = chieuDai.nextFloat();

        System.out.println("Nhap vao chieu rong ");
        float chieurongValue = chieuRong.nextFloat();

        float chuVi = (chieuDaiValue + chieurongValue)*2;
        float dienTich = chieuDaiValue * chieurongValue;

        System.out.println("Chu vi hinh chu nhat la :" + chuVi);
        System.out.println("Dien tich hinh chu nhat la : " + dienTich);
    }
}
