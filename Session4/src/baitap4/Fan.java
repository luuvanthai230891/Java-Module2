package baitap4;

public class Fan {
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;
   private int speed = SLOW;

   private  boolean on;

   private double radius = 5;

   private String color;

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            // Nếu quạt đang ở trạng thái "on"
            return "Fan is on - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            // Nếu quạt đang ở trạng thái "off"
            return "Fan is off - Color: " + color + ", Radius: " + radius;
        }
    }

    }

