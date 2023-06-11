package week5.pb1.ex;

public class Rectangle {
    int x;
    int y;
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void show() {
        System.out.println("A rectangle with " + width + "x" + height + " at (" + x + "," + y + ")");
    }

    int square() {
        return width * height;
    }

    boolean contains(Rectangle rectangle) {
        if ((x + width > rectangle.x + rectangle.width) & (y + height > rectangle.y + rectangle.height)) {
            return true;
        } else {
            return false;
        }
    }
}
