package week7.pb5;

public class ColorPoint extends Point {
    String color;

    public ColorPoint() {
        super(0, 0);
        this.color = "black";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        this.color = "black";
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "The " + color + " point at (" + getX() + "," + getY() + ")";
    }
}
