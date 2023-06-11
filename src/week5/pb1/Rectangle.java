package week5.pb1;

public class Rectangle {
    int x;
    int y;
    int width;
    int height;
    int area;

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
        area = width * height;
        return area;
    }

    // A 사각형이 B 사각형 안에 포함되는지 확인하려면
    // A의 x + width 가 B의 x + width 보다 크고, A의 y + height 가 B의 y + height 보다 커야 한다.
    // 사각형 t와 s의 좌표는 같은데 예시의 output 에는 t가 s를 포함하지 않는다고 출력하기 때문에 >= 가 아닌 > 조건이다.
    boolean contains(Rectangle rectangle) {
        if ((x + width > rectangle.x + rectangle.width) & (y + height > rectangle.y + rectangle.height)) {
            return true;
        } else {
            return false;
        }
    }
}
