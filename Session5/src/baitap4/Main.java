package baitap4;

import java.util.Arrays;

public class Main {
//[Bài tập] 4.Tách chuỗi thành 1 mảng các ký tự
    public static void main(String[] args) {

        String string = "luyện tập thao tác và sử dụng với các phương thức của String.\n";

        String[] words = string.split("\\s");

//        System.out.println(Arrays.toString(words)); // in mang
//        Arrays.stream(words).forEach(word -> System.out.println(word)); // su dung lamda extention
//        Arrays.stream(words).forEach(System.out::println); // toi uu code
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

    }
}
