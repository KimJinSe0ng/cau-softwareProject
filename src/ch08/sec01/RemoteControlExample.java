package ch08.sec01;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Audio(); // 1.RemoteControl 인터페이스를 구현한 객체만 rc에 넣을 수 있음
        rc.turnOn();
        System.out.println("Maximum volume: " + RemoteControl.MAX_VOLUME);
        rc.setMute(true);

        rc = new Television();
        rc.turnOn();
        rc.setMute(false);

        NoiseCancel nc; // 2.2.NoiseCancel 타입으로 선언한 순간 NoiseCancel에 선언한 추상메서드만 사용 가능함 -> 인터페이스에 구현한 거만 실행
        nc = new Audio();
//        nc.turnOn(); // 2.1.에러가 나는데 왜 에러가 날까요? NoiseCancel에는 turnOn 메서드가 없다.
        nc.cancelNoise();

        RemoteControl.changeBattery(); // 4.리모트컨트롤만의 정적메서드이기 때문에, 변수를 선언하고 객체를 만들고 할 필요 없음
    }
}
