package ch07.sec02;

public class Car {
    public Tire tire;

    public void run() {
        tire.roll();
    }

    public void tiretest(Tire tr) {
        tr.roll();
    }
}
