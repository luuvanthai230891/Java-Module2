package baitap9;

public class Main {
    //[BaiTap] 9.Kiểm tra chuỗi chứa chuỗi khác
    public static void main(String[] args) {
        String string1 = "HelloWorld";
        String string2 = "HelloWorld";

        boolean check = string1.contains(string2);

        if(check){
            System.out.println("Chuoi 1 chua chuoi 2");
        } else {
            System.out.println("Chuoi 1 khong chua chuoi 2");
        }

    }
}
