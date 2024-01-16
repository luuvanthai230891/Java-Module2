package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // tạo máy nhập

        System.out.println("Nhập a:");
        double a = sc.nextDouble(); // nhập a

        System.out.println("Nhập b:");
        double b = sc.nextDouble(); // nhập b

        System.out.println("Nhập c:");
        double c = sc.nextDouble(); // nhập c

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b , c); // tạo đối tượng phương trình
        double delta =  quadraticEquation.getDiscriminant(a,b,c); // lấy delta
        if(delta > 0 ){ //khởi tạo điều kiện và in ra nghiệm tương ứng
            System.out.println("2 nghiệm của phương trình ax2 + bx + c = 0 là: ");
            System.out.println("Nghiệm 1 là :" + quadraticEquation.getRoot1(a,b,delta));
            System.out.println("Nghiệm 2 là:" + quadraticEquation.getRoot2(a,b,delta));
        }else if(delta == 0){
            System.out.println("Phương trình có 1 nghiệm duy nhất là :" + quadraticEquation.getRoot1(a,b,delta));
        }
        System.out.println("Phương trình vô nghiệm");
    }
}
