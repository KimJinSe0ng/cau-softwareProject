package week11.pb8;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle with radius " + r);
    }

    @Override
    public double getArea() {
        return r * r * PI;
    }
}
