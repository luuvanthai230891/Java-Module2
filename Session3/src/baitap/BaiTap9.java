package baitap;

public class BaiTap9 {
    public static void main(String[] args) {
                // Khởi tạo mảng
                int[] array = {1, 2, 9, 3, 8, 6, 5, 4 ,10 ,12};

                // Gọi phương thức tìm phần tử lớn thứ hai và in kết quả
                int secondValue = findElementSecondMaxValue(array);

                System.out.println("Phần tử lớn thứ hai trong mảng là: " + secondValue);

            }

            // Phương thức tìm phần tử lớn thứ hai trong mảng
            public static int findElementSecondMaxValue(int[] array) {

                int maxValue = array[0];
                int secondValue = array[1];

                // Duyệt qua mảng để xác định phần tử lớn nhất và lớn thứ hai
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > maxValue) {
                        // Nếu phần tử hiện tại lớn hơn phần tử lớn nhất
                        secondValue = maxValue;
                        maxValue = array[i];
                    } else if (array[i] > secondValue && array[i] != maxValue) {
                        // Nếu phần tử hiện tại lớn hơn phần tử lớn thứ hai, và không phải là phần tử lớn nhất
                        secondValue = array[i];
                    }
                }

                return secondValue; // trả về phần tử lớn thứ 2
            }
        }

