package method;

public class Calculator {
    // phép toán cộng 2 số nguyên
    public static int sumInt(int a, int b){
        return a+b;
    }
    // phép toán hiẹu 2 số nguyên
    public static int minusInt(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("2+3 = "+sumInt(2,3));
    }

}