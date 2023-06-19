package lecture8;

public sealed class Tire permits HankookTire {
    public String model;

    public void start() {
        System.out.println("Start!");
    }
    public void roll() {} // 상속받는 자식들은 반드시 이 메소드를 오버라이딩 해줘라
//        System.out.println("The tire is rolling");
}
