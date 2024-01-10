package baitap7;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner numberValue = new Scanner(System.in);
        System.out.println("Nhap vao chuoi so tu 1 - 9");

        int number = numberValue.nextInt();

        switch (number) {
            case 1:
                System.out.println("Cach doc la : SO MOT " );
                break;

            case 2:
                System.out.println("Cach doc la : SO HAI " );
                break;

            case 3:
                System.out.println("Cach doc la : SO BA " );
                break;

            case 4:
                System.out.println("Cach doc la : SO BON " );
                break;

            case 5:
                System.out.println("Cach doc la : SO NAM " );
                break;

            case 6:
                System.out.println("Cach doc la : SO SAU " );
                break;

            case 7:
                System.out.println("Cach doc la : SO BAY " );
                break;

            case 8:
                System.out.println("Cach doc la : SO TAM " );
                break;

            case 9:
                System.out.println("Cach doc la : SO CHIN " );
                break;
            default:
                System.out.println("So khong hop le");
        }
    }
}
