package oop;

import java.text.ParseException;
import java.util.Scanner;

public class StudentCrud {
    public static Student[] students = new Student[0];

    public void addNewStudent(Scanner sc) throws ParseException {
        // Nhập số lượng cần thêm
        System.out.println("Nhạp số lượng câ thêm");
        int n = Integer.parseInt(sc.nextLine());
        // tạo mảng mới và copy giá trị cũ sang
        Student[] newStudents = new Student[students.length+n];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        for (int i = 0; i < n; i++) {
            Student newStudent = new Student();
            newStudent.inputData(sc);
            newStudents[students.length+i] = newStudent;
        }

        students = newStudents;
    }
    public void showAllStudent(){
        if (students.length==0){
            System.err.println("Danh sách rỗng");
        }else {
            System.out.println("Danh sách học sinh");
            for (int i = 0; i <students.length ; i++) {
                students[i].displayData();
            }
        }
    }
    public void updateStudent(Scanner sc) throws ParseException {
        // Nhập id cần sửa
        System.out.println("Nhaap id cần edit :");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if (indexById !=-1){
            // bắt nhập thông tin mới
//            Student editStudent = students[indexById];
//            editStudent.inputData(sc);
            System.out.println("Thông tin cũ");
            System.out.println(students[indexById]);
            System.out.println("Nhập thông tin mới");
            students[indexById].inputData(sc);
            System.out.println("Cập nhạt thanh cong");
        }else {
            System.err.println("id khong tim thay");
        }
    }
    public void deleteStudent(Scanner sc){
        // Nhập id cần xóa
        System.out.println("Nhaap id cần xoa :");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if (indexById !=-1){
            Student[] newStudent = new Student[students.length-1];
            for (int i = 0; i < newStudent.length; i++) {
                if(i<indexById){
                    newStudent[i] = students[i];
                }else if (i>indexById){
                    newStudent[i-1] = students[i];
                }
            }
            students = newStudent;
            System.out.println("Xóa thành công");
        }else {
            System.err.println("id khong tim thay");
        }
    }
    public int findIndexById(String id){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}