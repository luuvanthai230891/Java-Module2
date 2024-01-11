package BaiTap6;

import java.util.Scanner;

public class Main {
//    [Bài tập] Hiển thị 20 số nguyên tố đầu tiên
    public static void main(String[] args) {

        int count = 0; // biến đếm
        int number = 1; // biến kiểm tra
        while (count < 20){
            //gọi phương thức kiểm tra số nguyên tố
            if(isPrime(number)){
                // tìm thấy thì in ra
                System.out.println(number);
                //tăng biến đếm
                count++;
            }
            number++;//tăng biến kiểm tra
        }
    }
// định nghĩa phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
