package week7.pb5;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() {
        z += 1;
    }

    public void moveDown() {
        z -= 1;
    }

    public void move(int x, int y, int z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "The point at (" + getX() + "," + getY() + ","+ z + ")";
    }
}
