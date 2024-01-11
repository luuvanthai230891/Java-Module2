package BaiTap3;

import java.util.Scanner;

public class Main {
//    [Bài tập] Tạo ứng dụng tính chu vi và diện tích các loại hình
    public static void main(String[] args) {
        int condition = -1;// biến điều kiện lặp menu
        Scanner scanner = new Scanner(System.in);// đọc dữ liệu đầu vào
//Khởi tạo menu
        while (condition != 0){
            System.out.println(" Menu gồm các lựa chọn như sau");
            System.out.println("1:In hình chữ nhật (Rectangle) ");
            System.out.println("2:In hình tam giác vuông góc vuông ở 4 góc khác nhau: ");
            System.out.println("3:In hình tam giác cân ( Isosceles triangle)");
            System.out.println("4:Exit ");
            int inputValue = scanner.nextInt(); // lựa chọn của người dùng

            switch(inputValue){
                case 1: // In hình chữ nhật (Rectangle)
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhap chieu dai hinh chu nhat");
                    int chieuDai = scanner1.nextInt();
                    System.out.println("Nhap chieu rong hinh chu nhat");
                    int chieuRong = scanner1.nextInt();
                    for(int i = 0; i < chieuRong; i++){
                        for(int j = 0; j < chieuDai; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                }
                    break;
                case 2: // in tam giác dưới cùng bên trái
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhap chieu cao tam giac");
                    int chieuCao = scanner2.nextInt();
                    for (int i = 1; i <= chieuCao; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                       // in tam giác dưới cùng bên trái
                    for (int i = chieuCao; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                       // in tam giác trên cùng bên phải
                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = 0; j < chieuCao; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                       // in tam giác dưới cùng bên phải
                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = 0; j < chieuCao; j++) {
                            if (j < chieuCao - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3: // in tam giác cân lộn ngược
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Nhap chieu cao tam giac");
                    int chieuKao = scanner3.nextInt();
                    for (int i = 0; i < chieuKao; i++) {
                        for (int j = 0; j < chieuKao; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                       //in tam giác cân
                    for (int i = 0; i < chieuKao; i++) {
                        for (int j = 0; j < chieuKao; j++) {
                            if (j < chieuKao - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4: //kết thúc chương trình
                    System.exit(0);
            }
        }


    }

}
