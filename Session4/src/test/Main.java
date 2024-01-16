package test;

import oop.Person;
import oop.Student;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        // cú pháp tạo đối tượng
//        Person person = new Person(1.8f,80);
//        Person person1 = new Person(1.9f,79);
//        Person person2 = new Person(1.7f,75);
//        // truy xuất thuộc tính và phương thức thông qua dấu .
//        person.setWeight(90);
//        person.setHeight(1.75f);
//        System.out.println(person);
//        System.out.println(person1);
//        System.out.println(person2);
//
//        System.out.println("height = "+person.getHeight());
//        System.out.println("weight = "+person.getWeight());
//
//        System.out.println("bmi = "+person2.getBMI());


        // Phạm vi truy câp của thuộc tính và phương thức
        // - PUBLIC : Công khai - truy cập mọi nơi
        // - PROTECTED : cho phép truy cập cùng package, trong quan hệ kế thừa
        // - default : chỉ cho phép truy caapj trong package
        // - private : chỉ cho phép truy cập trong lớp


        Student s1 = new Student();
        // nhập dữ liệu từ bán phím
        s1.inputData(new Scanner(System.in));
        // hiển thị giá trị vừa nhạp ra
        s1.displayData();
    }

}