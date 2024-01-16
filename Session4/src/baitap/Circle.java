package baitap;

public class Circle {
   private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(float radius){
        return this.radius * Math.PI *2;
    }

    public double getPerimeter(float radius){
        return Math.pow(this.radius,2)*Math.PI;
    }


}
