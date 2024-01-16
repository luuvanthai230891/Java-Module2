package baitap8;

public class Main {
    public static void main(String[] args) {



        System.out.println("Dien tich hinh tron 1 la :" + StaticMethod.calCircleArea(3.5) );
        System.out.println("Dien tich hinh tron 2 la :" + StaticMethod.calCircleArea(6) );

        System.out.println("Dien tich tam giac 1 la : " + StaticMethod.calculateTriangleArea(3,4,5));
        System.out.println("Dien tich tam giac 1 la : " + StaticMethod.calculateTriangleArea(4.5,7,6));

        System.out.println("Dien tich hinh chu nhat 1 la: " + StaticMethod.calRectangleArea(2.5,6));
        System.out.println("Dien tich hinh chu nhat 1 la: " + StaticMethod.calRectangleArea(4,7));
    }
}
