package lecture8;

// 필드 다형성: 어떤 클래스의 필드로서 다른 클래스가 부품(필드)으로 쓰이는 경우 + 오버라이딩 한걸 불러와줌
public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        Tire testtire = new KumhoTire();
        testtire.roll();
    }
}
