package baitap8;

public class Main {
//    [BaiTap] 8.Thay thế chuỗi
    public static StringBuilder replaceString(String string1,String string2,int start, int end){
        StringBuilder stringBuilder = new StringBuilder(string1);
        return  stringBuilder.replace(start,end, string2);
    }

    public static void main(String[] args) {

        String string1 = "HelloWorld";
        String string2 = "Hello";

        System.out.println("Chuoi sau khi thay the la :" + replaceString(string1,string2,5,10));
    }
}
