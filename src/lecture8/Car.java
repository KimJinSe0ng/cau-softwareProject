package lecture8;

public class Car {
    public Tire tire;

    public void run() {
        tire.roll();
//        tire.method(); // error: tire가 정해지지 않았는데 금호 타이어의 method를 불러옴
    }

    public void tiretest(Tire tr) {
        tr.roll();
    }
}
