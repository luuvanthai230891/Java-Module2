package oop;

public class Person {
    // định nghĩa thuộc tính
    private float height; // chiêu cao - m
    private float weight; // cân nặng - kg
    // phương thức khởi tạo : dùng để tạo 1 đối tượng ,
    // trùng tên Class ,
    // ko có kiều dữ liệu trả  về,
    // pham vi truy cập là public
    // khi ko khai báo phương thức khởi tạo thì có
    // phương thức khởi tạo mặc định 0 tham số


    public Person() {
    }

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    // phương thức :
    // getter setter


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBMI(){
        // tính bmi
        return this.weight/(this.height*this.height);
    }

    @Override // ghi đè của lớp Object
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}