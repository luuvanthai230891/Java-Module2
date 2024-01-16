package thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the width:");
//        double width = scanner.nextDouble();
//
//
//        System.out.println("Enter the height: ");
//        double height = scanner.nextDouble();
//
//
//        Rectangle rectangle = new Rectangle(width, height);
//
//        System.out.println("Your Rectangle \n" + rectangle.display());
//        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: " + rectangle.getArea());
//
//        Student student1 = new Student(1, "Nguyen van a", true,"Jv-01",19,"ha noi");
//        Student student2 = new Student(2, "Nguyen van b", true,"Jv-01",20,"ha noi");
//        Student student3 = new Student(3, "Nguyen van c", true,"Jv-01",21,"ha noi");
//
//        System.out.println("---------------------Student1-----------------");
//        student1.display();
//        System.out.println("---------------------Student1-----------------");
//        student2.display();
//        System.out.println("---------------------Student1-----------------");
//        student3.display();

//        Category category1 = new Category(1, "Oto");
//        Category category2 = new Category(2, "xemay");
//
//        Product product1 = new Product(1, "madza", 15.00, category1);
//        Product product2 = new Product(2, "madza", 15.00, category1);
//
//
//        Product product3 = new Product(3, "vision", 15.00, category2);
//        Product product4 = new Product(4, "liberty", 15.00, category2);
//
//        product1.display();
//        product2.display();
//        product3.display();
//        product4.display();

//        Scanner input = new Scanner(System.in);
//
//        Calculator calculator = new Calculator();
//
//        System.out.println("nhap a");
//        double a = input.nextDouble();
//
//        System.out.println("nhap b");
//        double b = input.nextDouble();

//        calculator.a = 10;
//        calculator.b = 11;
//
////        calculator.setA(a);
////        calculator.setB(b);
//
//        System.out.println("tong" + calculator.add());
//        System.out.println("hieu" + calculator.sub());
//        System.out.println("tich" + calculator.multi());
//        System.out.println("thuong" + calculator.div());
        Car car1 = new Car("vin", "Vf6");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("vinF", "vf5");

        System.out.println(Car.numberOfCars);
    }
}
