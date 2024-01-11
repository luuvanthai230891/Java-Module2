package BaiTap8;

import java.util.Scanner;

public class Main {
    //     phát triển một ứng dụng cho phép người dùng nhập vào 3 cạnh của tam giác,
//         kiểm tra xem nếu 3 cạnh đấy thoả mãn điều kiện trở thành 1 tam giác thì cho phép
//         tính diện tích và chu vi, nếu không thì bắt người dùng nhập lại
    public static void main(String[] args) {

//        khởi tạo biến condition cho vòng lặp
       int choice = -1;
//        tạo đối tượng đọc dữ liệu từ nguồn đầu vào
        Scanner scanner = new Scanner(System.in);
//        khởi tạo vòng lặp vô hạn while
        while(choice != 0){
//        yêu cầu người dùng nhập vào 3 cạnh tam giác
            System.out.println("Nhập vào giá trị của 3 cạnh tam giác");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
//         chu vi tam giác
            int chuVi = a + b + c;
            int p = (a + b + c)/2;
//         diện tích tam giác
            double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
//         Gọi phương thức check kiểm tra 3 cạnh tam giác
            if(check(a, b, c)){
                System.out.println("Chu vi tam giác là :" + chuVi);
                System.out.println("Diện tích tam giác là :" + dienTich + " đơn vị diện tích");
                break;
            } else {
                System.err.println("Xin mời nhập lại");
            }
        }
    }
//    định nghĩa phương thức check kiểm tra điều kiện 3 cạnh tam giác
    public static boolean check(int a, int b, int c){
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (b + c > a) && (c + a > b);
    }
}
