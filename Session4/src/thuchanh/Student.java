package thuchanh;

public class Student {
    int studentId;

    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.println("Ma hs: "  + studentId + "\n"
        + "Ten hs: " + studentName + "\n"
        + "Tuoi:" + age + "\n"
        + "Gioi tinh:" + (sex?"Nam":"Nu")+ "\n"
        + "Lop: " + className + "\n"
        + "dia chi: " + address);
    }


}
