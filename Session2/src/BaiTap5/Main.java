package BaiTap5;

import java.util.Scanner;

public class Main {
    // Tìm số nguyên duong nhỏ nhất chia hết cho 5,7,11
    public static void main(String[] args) {
//  khởi tạo biến kiểm tra
        int number = 1;
/*
* vòng lặp while vô hạn
* điều kiện đúng trả về giá trị tìm thấy và kết thúc loop
* nếu k tìm thấy tiếp tục tăng biến kiểm tra để lặp
* */
        while (true){
            if(number % 5 == 0 && number % 7 == 0 && number % 11 == 0){
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5,7,11 là: " + number);
                break;
            }
            number++;
        }


    }


}
