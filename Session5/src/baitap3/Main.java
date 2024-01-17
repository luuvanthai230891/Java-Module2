package baitap3;

//public class Main {
//
//    public static StringBuffer strReverse(String string){
//        StringBuffer stringBuffer = new StringBuffer();
//       return stringBuffer.reverse();
//    }
//
//    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("Hello World");
//        System.out.println("Chuoi sau khi dao nguoc la" +  stringBuffer.reverse());
//
//    }
//}
public class Main {
//    Bài tập Đảo ngược chuỗi StringBuffer
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static void main(String[] args) {
        String originalString = "Hello World";
        String reversedString = reverseString(originalString);

        System.out.println("Chuỗi sau khi đảo ngược là: " + reversedString);
    }
}

