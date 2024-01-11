package baitap5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float rate = 23000f;
        Scanner monney = new Scanner(System.in);
        System.out.println("Nhap vao so usd");
        float monneyUsd = monney.nextFloat();

        float monneyVnd = monneyUsd * rate;

        System.out.println("Ti gia hien tai la :" + monneyUsd + "USD" + " = " + monneyVnd + "VND");
    }
}
