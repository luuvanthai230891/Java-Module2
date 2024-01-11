package ThucHanh4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double money = 1.0; // tien gui
        int month = 1; // thang gui
        double interestRate = 1.0; //ti le lai suat

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = input.nextDouble();
        System.out.println("Nhap so thang gui");
        month = input.nextInt();
        System.out.println("Nhap ti e lai suat");
        interestRate = input.nextDouble();

        double totalMoney = 0;

        for(int i = 0; i <  month ; i++){
            totalMoney += money + (interestRate/100)/12 * month;
        }
        System.out.println("tong tien lai la: " + totalMoney);
    }
}
