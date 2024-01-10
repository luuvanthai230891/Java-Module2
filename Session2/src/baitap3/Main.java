package baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Nhap vao 1 so tu nhien bat ky");

       int numbervalue =  number.nextInt();

       if(numbervalue % 3 == 0 && numbervalue % 5 == 0){
           System.out.println(numbervalue + ": Chia hết cho cả 3 và 5");
       }else if(numbervalue % 3 == 0 && numbervalue % 5 != 0){
           System.out.println(numbervalue + ": Chỉ chia hết cho 3");
       }else if(numbervalue % 5 == 0 && numbervalue % 3 != 0){
           System.out.println(numbervalue + ": Chỉ chia hết cho 5");
       }else if(numbervalue % 5 != 0 && numbervalue % 3 != 0){
           System.out.println(numbervalue + ": Không chia hết cho 3 , cũng không chia hết cho 5");
       }
    }
}
