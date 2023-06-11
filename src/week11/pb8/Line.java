package week11.pb8;

public class Line implements Angular {

    private int center;
    private int length;

    public Line(int center, int length) {
        this.center = center;
        this.length = length;
    }

    @Override
    public void printVertex() {
        int mid = length / 2;
        int x = center - mid;
        int y = center + mid;
        System.out.printf("Vertex: (%d,0) (%d,0)", x, y);
    }
}
