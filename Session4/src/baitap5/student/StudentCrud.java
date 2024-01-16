package baitap5.student;

import java.text.ParseException;
import java.util.Scanner;

public class StudentCrud {
    public static Student[] students = new Student[100];

    public void addNewStudent(Scanner sc) throws ParseException {
        System.out.println("Nhap so luong can them");
        int n = Integer.parseInt((sc.nextLine()));
//        tao mang moi va copy so luong mang cu sang
        Student[] newStudents = new Student[students.length + n];
        for(int i = 0; i < students.length ; i++){
            newStudents[i] = students[i];
        }
        for(int i = 0; i < n; i++){
            Student newStudent = new Student();
            newStudent.inputData(sc);
            newStudents[students.length+i] = newStudent;
        }
        students = newStudents;
    }
    public void showAllStudent(){
        if(students.length==0){
            System.err.println("danh sach rong");
        }else{
            System.out.println("Danh sach hoc sinh");
            for(int i = 0; i < students.length; i++){
                students[i].displayData();
            }
        }
    }
    public void updateStudent(Scanner sc) throws ParseException {
        System.out.println("Nhap id can edit: ");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if(indexById !=-1){ // tim thay
            //nhap thong tin moi
            Student editStudent = students[indexById];
            editStudent.inputData(sc);
            System.out.println("Thong tin cu");
            System.out.println(students[indexById]);
            System.out.println("nhap thong tin moi");
            students[indexById].inputData(sc);
            System.out.println("Cap nhat thanh cong");
        } else {
            System.err.println("Khong tim thay id");
        }
    }
    public void deleteStudent(Scanner sc){
        //nhap id can xoa
        System.out.println("Nhap id can xoa: ");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if(indexById !=-1){
            Student[] newStudent = new Student[students.length-1];
            for(int i = 0; i < newStudent.length; i++){
                if(i<indexById){
                    newStudent[i] = students[i];
                }else if(i>indexById){
                    newStudent[i-1] = students[i];
                }
            }
            students = newStudent;
            System.out.println("Xoa thanh cong");
        }else {
            System.err.println("id khong tim thay");
        }
    }

     public int findIndexById(String id){
        for(int i = 0; i < students.length; i++){
            if(students[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
     }
}