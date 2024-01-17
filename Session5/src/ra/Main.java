package ra;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello World!");

        String str = "hello";

        //lay ra do dai chuoi
        System.out.println(str.length());

        //lay ra phan tu tai index chi dinh
        System.out.println(str.charAt(2));

        //noi chuoi -> tra ve 1 chuoi moi
        String newStr =  str.concat("world");
        System.out.println(newStr);

        // so sanh equals
        str.equals(newStr);
        System.out.println("so sanh str vs newstr: " + str.equals(newStr));

        // equals so sanh khong phan biet in hoa in thuong
        String string = "HELLO";
        System.out.println("khong phan biet hoa thuong " + str.equalsIgnoreCase(string));

        // hieu cua 2 chuoi
        // thuong luon luon lon hon hoa 32
        System.out.println("hieu 2 chuoi:" + str.compareTo(string));
        System.out.println("hieu 2 chuoi:" + string.compareTo(str));

        //sap xep mang chuoi
        String[] arr = {"Hung","anh","loc"};
        // sap xep
        Arrays.sort(arr, String::compareTo);

        //contains tim kiem tuong doi
        System.out.println("kiem tra chuoi truyen vao co phai chuoi con khong:" + newStr.contains("world"));


        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";


        System.out.println(s1.startsWith("Wel"));

        //StringBuilder(bat dong bo) ->su dung stringbuider huong toi da luong, toc do xu ly nhanh, k su dung chung tai nguyen
        // StringBuffer (dong bo) -> su dung bo nho dem khi chinh sua, toc do xu ly cham hon
        // chuyen doi tu string sang StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        //noi chuoi
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        //noi chuoi theo vi tri chi dinh
        stringBuilder.append("rikkei academy", 7,14);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"rikkei");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,10);
        System.out.println(stringBuilder);

        int n =88888888;
        StringBuilder stringBuildersb = new StringBuilder("sb");
        long t = System.currentTimeMillis();
        for(int i = 0; i < n; i++){
            stringBuilder.append(i);
        }
        System.out.println(System.currentTimeMillis()-t);

        //REGEX
        //So khop du lieu
        //cach 1:
        Pattern pattern = Pattern.compile("\\d{9}");
        Matcher matcher = pattern.matcher("092323232");
        System.out.println(matcher.matches());

        //cach 2
        System.out.println(Pattern.compile("^[0-9]{9}$").matcher("123456789").matches());

        //cach 3
        System.out.println("123456789".matches("\\d{9}"));

        //cach 4
        boolean checkk = Pattern.matches("\\d{9}","123456789");
        System.out.println(checkk);
    }
}
