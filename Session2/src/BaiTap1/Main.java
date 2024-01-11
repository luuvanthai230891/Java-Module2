package BaiTap1;

import java.util.Scanner;
//[Bài tập] Tính tổng các số chẵn trong khoảng cho trước
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// đọc dữ liệu đầu vào

        System.out.println("Enter first value: ");// yêu cầu người dùng nhập vào giá trị đầu tiên
        int firstValue = scanner.nextInt();

        System.out.println("Enter last value: ");// yêu cầu người dùng nhập vào giá trị cuối cùng
        int lastValue = scanner.nextInt();

        int sum = 0; // biến lưu trữ tổng
/*
 * khởi tạo vòng lặp tìm số chẵn
 * mỗi lần lặp qua i nếu i là số chẵn sẽ cộng dồn vào biến lưu trữ
 * tăng giá trị i lên 1 sau mỗi lần lặp
 */
        for(int i = firstValue; i <= lastValue; i++){
            if(i % 2 == 0){
                sum += i;
                i++;
            }
        }
        System.out.print("Sum of even numbers :" + sum);// in ra tổng các số chẵn
    }
}
