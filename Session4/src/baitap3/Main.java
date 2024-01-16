package baitap3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo một mảng ngẫu nhiên với 100,000 số
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000); // Giả sử giới hạn số random là 1,000,000
        }

        // Khởi tạo đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Sắp xếp mảng sử dụng thuật toán sắp xếp chọn
        selectionSort(array);

        // Dừng đồng hồ và in thời gian thực thi
        stopwatch.stop();
        System.out.println("Elapsed Time: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Thuật toán sắp xếp chọn
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử tìm thấy nhỏ nhất với phần tử đầu tiên của dãy chưa sắp xếp
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
