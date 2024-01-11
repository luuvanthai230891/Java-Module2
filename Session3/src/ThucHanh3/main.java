package ThucHanh3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a  = input.nextInt();
        System.out.println("Nhap b: ");
        b = input.nextInt();
//        ham abs tra ve gia tri tuyet doi
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("Khong co uoc chung lon nhat ");
        }
        while (a != b){
            if(a>b){
                a = a - b;
                System.out.println("a = " + a);
            }else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println("uoc chung lon nhat la : " + a);
    }
}
