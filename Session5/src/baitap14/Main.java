package baitap14;

public class Main {
    //[Bài tập] 14.Đếm số từ trong chuỗi
    public static int countWord(String string, int a){
        String[] words = string.trim().split("\\s+");
        int count = 0;
        for(int i =0; i < words.length; i++){
            if(words[i].length() >= a){
                count++;
                System.out.println(words[i]);
            }
        }
        return count;
    }


    public static void main(String[] args) {
      String str = " Mục tiêu: Luyện tập thao tác và sử dụng với các phương thức của String.\n" +
              "Đề bài: Viết một phương thức Java để đếm số lượng từ trong chuỗi có độ dài lớn hơn hoặc bằng một giá trị cho trước.\n" +
              "Hướng dẫn: Dùng phương thức length() để lấy được độ dài của chuỗi.";

        System.out.println("length" + countWord(str, 5));

    }
}
