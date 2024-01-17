package baitap10;

public class Main {
//    [Bài tập] Đổi chữ hoa thành chữ thường
    public static String changeString(String string){
      return string.equals(string.toUpperCase())?string.toLowerCase():string.toUpperCase();
    }

    public static void main(String[] args) {

        String string = "Helololololo";

        System.out.println("chuoi sau khi chuyen doi la: "+changeString(string) );

    }
}
