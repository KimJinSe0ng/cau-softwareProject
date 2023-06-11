package week9.pb6;

public abstract class Calc {

    protected int a, b;
    void setValue(int a, int b) {
        // to do
        this.a = a;
        this.b = b;
    }

    abstract int calculate();
}
