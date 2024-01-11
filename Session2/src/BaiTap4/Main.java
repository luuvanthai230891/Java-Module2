package BaiTap4;

import java.util.Scanner;

public class Main {
    //phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100.
    public static void main(String[] args) {
// khởi tạo vòng lặp
      for(int i = 2; i < 100; i++){
//  gọi phương thức isPrime check số nguyên tố
    if(BaiTap6.Main.isPrime(i)){
//  in ra số nguyên tố
        System.out.println(i);
    }
    }
    }

}
