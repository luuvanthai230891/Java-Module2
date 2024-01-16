package run;

import method.Calculator;
import ra.Demo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.checkPrime(12);
        demo.display();
        System.out.println("2-5="+Calculator.minusInt(2,5));
    }
}