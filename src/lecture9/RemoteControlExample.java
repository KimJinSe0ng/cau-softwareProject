package lecture9;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Audio();
        rc.turnOn();
        System.out.println("Maximum volume: " + RemoteControl.MAX_VOLUME);
        rc.setMute(true);

        rc = new Television();
        rc.turnOn();
        rc.setMute(false);

        NoiseCancel nc; // NoiseCancel이라 선언한 순간, NoiseCancel 안에 있는 추상 메서드만 사용
        nc = new Audio();
        nc.cancelNoise();

        RemoteControl.changeBattery();
//        rc.changeBattery(); // error: static 메서드의 경우, 인터페이스 이름으로 호출해야 함
    }
}
