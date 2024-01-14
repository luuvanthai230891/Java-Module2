package thuchanh;

import java.util.Scanner;

public class ThucHanh4 {
    //    [Thực hành] Chương trình chuyển đổi nhiệt độ
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. doF thanh doC");
            System.out.println("2. doC thanh doF");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon.");
            choice = input.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Nhap do F: ");
                    doF = input.nextDouble();
                    System.out.println("Chuyen doF thanh doC: " + chuyenDoiDoF(doF));
                    break;
                }
                case 2: {
                    System.out.println("Nhap do C: ");
                    doC = input.nextDouble();
                    System.out.println("Chuyen doC thanh doF: " + chuyenDoiDoC(doC));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);

    }
public static double chuyenDoiDoC(double doC) {
        double doF = (9.0/5)*doC + 32;
        return doF;
}
public static double chuyenDoiDoF(double doF){
        double doC = (5.0/9)*(doF -32);
        return doC;
}
}