package baitap8;

public class StaticMethod {
   public static double PI = 3.14;
   public static double calCircleArea(double R){
      return Math.pow(R,2) * PI;
   }

   public static double calRectangleArea(double width, double height){
      return width*height;
   }

   public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
      // Tính nửa chu vi
      double s = (sideA + sideB + sideC) / 2.0;

      // Sử dụng công thức Heron để tính diện tích
      double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

      return area;
   }



}
