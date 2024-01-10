package baitap6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Nhap vao so can doc");

        int numberValue = number.nextInt();

            if  (numberValue >= 0 && numberValue < 10)  {
                switch (numberValue) {
                    case 0:
                        System.out.println("Khong");
                    case 1:
                        System.out.println("Mot");
                    case 2:
                        System.out.println("Hai");
                    case 3:
                        System.out.println("Ba");
                    case 4:
                        System.out.println("Bon");
                    case 5:
                        System.out.println("Nam");
                    case 6:
                        System.out.println("Sau");
                    case 7:
                        System.out.println("Bay");
                    case 8:
                        System.out.println("Tam");
                    case 9:
                        System.out.println("Chin");
                    default:
                        System.out.println("Khong doc duoc");
                }
            }
        }
    }
