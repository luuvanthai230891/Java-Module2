package baitap2;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a, double b,double c){
        return  Math.pow(this.b,2) - this.a*this.c*4;
    }

    public double getRoot1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
