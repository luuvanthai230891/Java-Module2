package baitap5.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private Date birthday;
    private boolean sex;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(String id, String name, Date birthday, boolean sex, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner sc) throws ParseException {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simf = new SimpleDateFormat(pattern);
        if(id==null){
            System.out.println("Nhap id: ");
            this.id = sc.nextLine();
        }
        System.out.println("Nhap name: ");
            this.name = sc.nextLine();
        System.out.println("Nhập ngày sinh : ");
        // chuyển đổi từ String => Date
        this.birthday = simf.parse(sc.nextLine());
        System.out.println("Nhập gen : ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập address : ");
        this.address = sc.nextLine();
        System.out.println("Nhập phoneNumber : ");
        this.phoneNumber = sc.nextLine();
    }
    public void displayData(){
        System.out.println("Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + (sex?"Nam":"Nữ") +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + (sex?"Nam":"Nữ") +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
