package week11.pb8;

public class Oval implements Shape{

    private double major;
    private double minor;

    public Oval(double major, double minor) {
        this.major = major;
        this.minor = minor;
    }

    @Override
    public void draw() {
        System.out.println("Oave with " + major + "x" + minor);
    }

    @Override
    public double getArea() {
        return major * minor * PI;
    }
}
