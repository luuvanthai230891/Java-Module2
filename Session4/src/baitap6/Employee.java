package baitap6;

import java.util.Scanner;

public class Employee {

     private String employeeId;

     private String employeeName;

     private String age;

     private boolean gen;

     private double rate;

     private String salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String age, boolean gen, double rate, String salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }
    public void inputData(Scanner sc){
        if(employeeId==null){
            System.out.println("Nhap id: ");
            this.employeeId = sc.nextLine();
        }
        System.out.println("Nhap ten: ");
        this.employeeName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gen = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap he so luong: ");
        this.rate = sc.nextDouble();
    }

    public void displayData(){
        System.out.println("Employee{" +
                "id='" + employeeId + '\'' +
                ", name='" + employeeName + '\'' +
                ", age=" + age +
                ", sex=" + (gen?"Nam":"Nữ") +
                ", rate='" + rate + '\'' +
                ", salary='" + calllSalary(rate) + '\'' +
                '}');
    }

    public double calllSalary(double rate){
        return this.rate * 1300000;
    }

}
