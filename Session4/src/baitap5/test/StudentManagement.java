package baitap5.test;

import baitap5.student.Student;
import baitap5.student.StudentCrud;

import java.text.ParseException;
import java.util.Scanner;

public class StudentManagement {
    public static StudentCrud studentCrud = new StudentCrud();

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("--------------Menu--------------");
            System.out.println("1. Show all students");
            System.out.println("2. Add new students");
            System.out.println("3. Edit students");
            System.out.println("4. Delete students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice){
                case 1: studentCrud.showAllStudent();
                break;
                case 2: studentCrud.addNewStudent(sc);
                break;
                case 3: studentCrud.updateStudent(sc);
                break;
                case 4: studentCrud.deleteStudent(sc);
                break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
