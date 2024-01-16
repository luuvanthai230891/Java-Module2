package ra;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class Demo {
    // phương thức khởi tạo
    public Demo(){

    }
    public static void main(String[] args) {
        // hàm dùng để chạy chương trình
        // khai báo mang tường minh
        int[] arrayName = {1,2,3,4,5};
        // sắp xêp

        // tính tổng
        System.out.println(Arrays.stream(arrayName).sum());

        // bản chất của String là 1 char[]
        // khai bao theo dộ dài
        int[] array = new int[10];// tất cả các phần tử trong mảng
        // này sẽ mang giá trị mặc định
        System.out.println(Arrays.toString(array));
        // truy cập và thay đổi giá trị của phần tử theo index
        array[3] = 100;
        System.out.println("Phần tử có index là 3 = "+array[3]);
        Demo demo = new Demo();

        // kiêm tra snt
        System.out.println(checkPrime(4));
        System.out.println(checkPrime(99));
        System.out.println(checkPrime(101));
        System.out.println(checkPrime(89));
        boolean check = checkPrime(392098948);

        String name = "hung"; //  string pool   name == name2
        String name2 = "hung"; //  string pool
        String name1 = new String("Hùng");


        String[] arrayString = {"Hùng","Đưc","Minh"};
        String[] copy = arrayString;
        String[] newArray = arrayString.clone(); // sao chép mảng
        // so sánh 2 đối tượng trong java
        System.out.println("check "+ arrayString.equals(copy));

        // mảng 2 chiều
        int[][] array2 ={{1,2},{1,3},{2,4}};

        // truy xuất phần tử đầu tiên của mảng bên ngoài
        System.out.println(array2[1][1]); // trong đó i là vị trí của phần tử mảng bên ngoài , j là vị trí của phần của mảng bên trong
        // duyệt mảng

//        cách 1
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        // cách 2 : foreach
        for (String element : arrayString){
            System.out.println(element);
        }
        // cách 3: dung stream
        Arrays.stream(arrayString).forEach((element)->{
            System.out.println(element.length());
        }); // trả về 1 dòng chảy các phần

        // duyệt mảng 2 chieeuf
        for (int i = 0; i < array2.length; i++) {
            int[] arr = array2[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }

    }
    // tạo hàm để kiểm tra số nguyên tố : tham số , kiểu trả về
    public static boolean checkPrime(int number){ // phương thức
        for (int i =2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // kiếm tra xem có  < 2
        return number>=2;
    }
    public void display(){

    }

    // tạo ra các hàm, phương thức để
    // 1 . thêm mới 1 giá trị vào mảng số nguyên và trả về mảng mới (2 tham số, mảng và giá trị cần thêm)
    // 2 . xóa 1 phần tử tại vị trí chỉ định trong mảng và trả về mảng sau khi đã đã

}