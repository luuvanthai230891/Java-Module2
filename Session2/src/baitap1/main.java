package baitap1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner nameValue = new Scanner(System.in);

        String name = nameValue.nextLine();
        System.out.println("Hello: " + name);

    }
}
