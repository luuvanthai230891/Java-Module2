package BaiTap7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tạo ứng dụng tính chu vi và diện tích các loại hình
        int condition = -1; // biến điều kiện
//        khởi tạo menu
        while (condition != 0){
            System.out.println("NHẬP LỰA CHỌN CỦA BẠN. \n" +
                    "1: Tính chu vi và diện tích hình chữ nhật.\n" +
                    "2: Tính chu vi và diện tích hình tam giác.\n" +
                    "3: Tính chu vi và diện tích hình tròn.\n" +
                    "4: Thoát\n");
            int inputValue = new Scanner(System.in).nextInt(); //giá trị chọn
//trường hợp chọn
        switch (inputValue){
            case 1: // Tính chu vi và diện tích hình chữ nhật.
                System.out.println("Nhập vào chiều dài và chiều rộng của hình chữ nhật");
                int chieuDai = new Scanner(System.in).nextInt();
                int chieuRong = new Scanner(System.in).nextInt();
                System.out.println("Diện tích hình chữ nhật là :" + dienTichHinhChuNhat(chieuDai, chieuRong));
                System.out.println("Chu vi hình chữ nhật là :" + chuViHinhChuNhat(chieuDai, chieuRong));
                break;
            case 2: //Tính chu vi và diện tích hình tam giác.
                System.out.println("Nhập vào giá trị của 3 cạnh tam giác");
                int a = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                int c = new Scanner(System.in).nextInt();
//         chu vi tam giác
                int chuVi = a + b + c;
                int p = (a + b + c)/2;
//         diện tích tam giác
                double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//         Gọi phương thức check kiểm tra 3 cạnh tam giác
                if(BaiTap8.Main.check(a, b, c)){
                    System.out.println("Chu vi tam giác là :" + chuVi);
                    System.out.println("Diện tích tam giác là :" + dienTich + " đơn vị diện tích");
                    break;
                } else {
                    System.err.println("Xin mời nhập lại");
                }
            case 3: // Tính chu vi và diện tích hình tròn.
                System.out.println("Nhập vào bán kính của hình tròn");
                double radius = new Scanner(System.in).nextInt();
                System.out.println("Chu vi hình tròn là: " + chuViHinhTron(radius));
                System.out.println("Diện tích hình tròn là: " + dienTichHinhTron(radius) );
                break;
            case 4: // thoát chương trình
                System.exit(0);
        }

        }
    }
    //định nghĩa phương thức tính diện tích hình chữ nhât
    public static int dienTichHinhChuNhat(int a, int b){
        if(a <= 0 || b <= 0){
            System.err.println("Giá trị nhập vào phải lớn hơn 0 . Vui lòng nhập lại !");
            return -1;
        }
        return a * b;
        //định nghĩa phương thức tính diện tích hình chữ nhât
    }public static int chuViHinhChuNhat(int a, int b){
        if(a <= 0 || b <= 0){
            System.err.println("Giá trị nhập vào phải lớn hơn 0 . Vui lòng nhập lại !");
            return -1;
        }
        return a * b;
    }
    //định nghĩa phương thức tính chu vi hình tròn
    public static double chuViHinhTron(double a){
        if(a <= 0){
            System.err.println("Giá trị nhập vào phải lớn hơn 0 . Vui lòng nhập lại !");
            return -1;
        }
        double chuVi = 2 * Math.PI * a;
        return chuVi;
    }
    //định nghĩa phương thức tính diện tích hình tròn
    public static double dienTichHinhTron(double a){
        if(a <= 0){
            System.err.println("Giá trị nhập vào phải lớn hơn 0 . Vui lòng nhập lại !");
            return -1;
        }
        double dienTich = Math.PI * Math.pow(a, 2);
        return dienTich;
    }
}
