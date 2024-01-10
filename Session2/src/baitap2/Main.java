package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        float sum = 0.00f;

        Scanner score = new Scanner(System.in);

        System.out.println("Nhap vao diem Toan cua ban : ");
        float scoreMath = score.nextFloat();
        count++;
        sum += scoreMath;

        System.out.println("Nhap vao diem Ly cua ban : ");
        float scorePhysical = score.nextFloat();
        count++;
        sum += scorePhysical;

        System.out.println("Nhap vao diem Hoa cua ban : ");
        float scoreChemistry = score.nextFloat();
        count++;
        sum += scoreChemistry;

        System.out.println("Nhap vao diem Van cua ban : ");
        float scoreVan = score.nextFloat();
        count++;
        sum += scoreVan;

        System.out.println("Nhap vao diem Tieng Anh cua ban : ");
        float scoreEnglish = score.nextFloat();
        count++;
        sum += scoreEnglish;

        float scoreAverage = sum / count;

        for (int i = 0 ; i <= 10; i++) {
            if ( i < 5 && i >= scoreAverage) {
                System.out.println("Diem TB cua ban la :" + scoreAverage + "Xep loai YEU");
                break;
            } else if (i >=5 && i < 6.5 && i == scoreAverage  ){
                System.out.println("Diem TB cua ban la :" + scoreAverage + "Xep loai TB");
                break;
            } else if(i >= 6.5 && i < 8 && i == scoreAverage) {
                System.out.println("Diem TB cua ban la :" + scoreAverage + "Xep loai KHA");
                break;
            } else if(i >= 8 && i < 9 && i == scoreAverage) {
                System.out.println("Diem TB cua ban la :" + scoreAverage + "Xep loai GIOI");
                break;
            }else if(i >= 9 && i == scoreAverage) {
                System.out.println("Diem TB cua ban la :" + scoreAverage + "Xep loai XUAT SAC");
                break;
            }
        }

    }
}