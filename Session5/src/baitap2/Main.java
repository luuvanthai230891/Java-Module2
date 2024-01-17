package baitap2;

public class Main {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();


       boolean check =  str1.equals(str2);
       if(check){
           System.out.println("Hai chuoi giong nhau");
       } else {
           System.out.println("Hai chuoi khac nhau");
       }
    }
}
