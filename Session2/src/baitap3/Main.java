package baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Nhap vao 1 so tu nhien bat ky");

       int numbervalue =  number.nextInt();

       if(numbervalue % 3 == 0 && numbervalue % 5 == 0){

      System.out.println(numbervalue + ": chia het cho ca 3 va 5");
}
    }
}
