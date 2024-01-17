package baitap1;

public class Main {
    public static boolean isEmpty(String str){
        //phuong thuc empty mac dinh la true
        return str == null || str.isEmpty();
    }
    public static void main(String[] args) {
        String str = "";
        String string = "Hello";
        System.out.println(str.isEmpty());
        System.out.println(string.isEmpty());
    }
}
