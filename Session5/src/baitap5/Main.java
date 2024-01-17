package baitap5;

//public class Main {
//    //[Bài tập] 5. Nối chuỗi
//    public static void main(String[] args) {
//        String string1 = "Hello";
//        String string2 = "World";
//
//        System.out.println("chuoi sau khi noi la: "+ string1.concat(string2));
//    }
//}
public class Main {
    //[Bài tập] 5. Nối chuỗi
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

//        dung StringBuilder giup toi uu hoa vung nho, tang hieu suat khi lam viec voi chuoi lon
        StringBuilder result = new StringBuilder();
        result.append(string1).append(string2);

        System.out.println("Chuỗi sau khi nối là: " + result.toString());
    }
}