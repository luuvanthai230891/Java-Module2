package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron 1 : ");
        float radius1 = sc.nextFloat(); // nhập vào bán kính
        Circle circle1 = new Circle(radius1); // khởi tạo đối tượng
        System.out.println("Chu vi hinh tron 1: " + circle1.getArea(radius1)); // gọi phương thức tính chu vi và in ra
        System.out.println("Dien tich hinh tron 1: "+ circle1.getPerimeter(radius1)); // gọi phương thức tính diện tích và in ra


        System.out.println("Nhap ban kinh hinh tron 2 : ");
        float radius2 = sc.nextFloat();// nhập vào bán kính
        Circle circle2 = new Circle(radius2); // khởi tạo đối tượng
        System.out.println("Chu vi hinh tron 2: " + circle2.getArea(radius2));// gọi phương thức tính chu vi và in ra
        System.out.println("Dien tich hinh tron 2: "+ circle2.getPerimeter(radius2));// gọi phương thức tính diện tích và in ra

    }
}
