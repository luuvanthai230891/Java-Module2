package BaiTap2;

import java.util.Scanner;
//[Bài tập] Tạo menu chức năng
public class Main {
    public static void main(String[] args) {

        int condition = -1;//  khởi tạo biến điều kiện

        Scanner scanner = new Scanner(System.in);// đọc dữ liệu đầu vào
/*    khởi tạo vòng lặp , điều kiện là biến khởi tạo != 0
*     thiết lập menu chọn
* */
        while(condition != 0){

            System.out.println("MOI NHAP LUA CHON ");
            System.out.println("1: Kiem tra tinh chan le cua 1 so");
            System.out.println("2: Kiem tra so nguyen to");
            System.out.println("3: Kiem tra mot so co chia het cho 3 khong");
            System.out.println("4: Thoat");

            int choiceValue = scanner.nextInt();// giá trị người dùng nhập vào

//  khởi tạo switch-case chạy các trường hợp nhập
            switch(choiceValue){

                case 1: // trường hợp ng dùng nhập vào 1 - kiểm tra số chẵn lẻ
                    System.out.println("Nhap vao so tu nhien bat ki");
                    Scanner scanner1 = new Scanner(System.in);
                    int inputValue1 = scanner1.nextInt();// giá trị người dùng nhập vào

//  nếu chia hết cho 2 thì là số chẵn và ngược lại
                    if(inputValue1 % 2 ==0){
                        System.out.println(inputValue1 + ": la so chan");
                    }else {
                        System.out.println(inputValue1 + ": la so le");
                    }
                    break;
                case 2: // trường hợp ng dùng nhập vào 2 - kiểm tra số nguyên tố
                    System.out.println("Nhap vao so tu nhien bat ki");
                    Scanner scanner2 = new Scanner(System.in);
                    int inputValue2 = scanner2.nextInt();// giá trị người dùng nhập vào

//gọi phương thức isPrime kiểm tra số nguyên tố
                    if(BaiTap6.Main.isPrime(inputValue2)){
                        System.out.println(inputValue2 + " là số nguyên tố");
                    } else {
                        System.out.println(inputValue2 + " không phải số nguyên tố");
                    }
                    break;
                case 3:// kiểm tra 1 số có chia hết cho 3 không
                    System.out.println("Nhap vao so tu nhien bat ky");
                    Scanner scanner3 = new Scanner(System.in);
                    int inputValue3 = scanner3.nextInt();// giá trị người dùng nhập vào
// nếu chia hết cho 3 thì in ra và ngược lại
                    if(inputValue3 % 3 == 0){
                        System.out.println(inputValue3 + ": chia het cho 3");
                    }else {
                        System.out.println(inputValue3 + ": khong chia het cho 3");
                    }
                    break;
                case 4: // kêt thúc chương trình
                    System.exit(0);
            }
        }


    }
}
