package week11.pb8;

public class Rect implements Shape, Angular {

    private double width;
    private double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with " + width + "x" + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void printVertex() {
        int x = (int) width / 2;
        int y = (int) height / 2;

        System.out.printf("Vertex: (%d,%d) (%d,%d) (%d,%d) (%d,%d)\n", -x, -y, x, -y, -x, y, x, y);
    }
}
