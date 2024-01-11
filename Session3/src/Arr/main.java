package Arr;

import java.sql.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Object[] objArr1 = {"1","2","3"};
        Object[] objArr2 = {"4","5","6"};
//
        Object[] objArr = add(objArr1, "4");
        System.out.println(Arrays.toString(objArr));
        //adding two arrays
        objArr = add(objArr1, objArr2);
        System.out.println(Arrays.toString(objArr));


    }

//    tham so la 1 arr va arr elements
    public static Object[] add(Object[] arr, Object... elements){
//        khoi tao arr moi co do dai bang mang cu cong do dai phan tu them vao
        Object[] tempArr = new Object[arr.length+elements.length];
//        System.out.println(Arrays.toString(tempArr));
//        coppy mang cu
        System.arraycopy(arr, 0, tempArr, 0, arr.length);
//lap qua cac phan tu trong mang can sao chep va tra ve mang moi
        for(int i = 0; i < elements.length; i++){
            tempArr[arr.length + i] = elements[i];
        }
        return tempArr;
    }
}
