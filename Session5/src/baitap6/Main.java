package baitap6;

public class Main {
//    [BaiTap] 6.Chèn vào vị trí bất kỳ trong chuỗi
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("HelloWorld");

        stringBuffer.insert(5,"Hello");

        System.out.println(stringBuffer);

    }
}
