package baitap4;

public class FanRun {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST,true,10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM,false,5,"blue");

        System.out.println("Fan1: " + fan1);
        System.out.println("Fan2: " + fan2);

    }
}
