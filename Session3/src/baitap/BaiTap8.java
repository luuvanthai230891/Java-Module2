package baitap;

public class BaiTap8 {
    public static void main(String[] args) {
        // Chuỗi đầu vào
        String string = "Học viện Rikkei Academy";

        // Ký tự cần đếm
        char word = 'k';

        // Gọi phương thức đếm số lần xuất hiện và in kết quả
        int frequencyOfAppearance = frequencyOfAppearance(string, word);
        System.out.println("Số lần xuất hiện của ký tự '" + word + "' trong chuỗi là: " + frequencyOfAppearance);
//        System.out.println(string.length());
//        System.out.println(string.charAt(4));
    }

    // Phương thức đếm số lần xuất hiện của một ký tự trong chuỗi
    public static int frequencyOfAppearance(String string, char word) {
        int frequency = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < string.length(); i++) {
            // Nếu ký tự tại vị trí i trùng khớp với ký tự cần đếm
            if (string.charAt(i) == word) {
                frequency++;
            }
        }

        return frequency;
    }
}
