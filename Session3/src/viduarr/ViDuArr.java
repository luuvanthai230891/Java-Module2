package viduarr;

import java.util.Arrays;

public class ViDuArr {
    public static void main(String[] args) {
        int[] myList = new int[10];
  for(int i = 0; i < myList.length; i++){
      myList[i] = i;
  }

        double[] myList1 = {1,1.2,1.3,1.4,1.5};
        System.out.println(Arrays.toString(myList1));

        int[] sourceArray = {2,3,4,5,6};
//        vi tri bo nho doc lap
        int[] targetArray = new int[sourceArray.length];
        targetArray = sourceArray;
//        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        System.out.println(Arrays.toString(targetArray));
//        int[] targetArray = new int[sourceArray.length];
//        for(int i = 0; i < sourceArray.length ; i++){
//            targetArray[i] = sourceArray[i];
//        }
//        System.out.println(Arrays.toString(targetArray));

    }
}
