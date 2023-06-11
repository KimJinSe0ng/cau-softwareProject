package ch08.sec01;

public class Television implements RemoteControl {

    @Override // 1.RemoteControl의 추상메서드들을 구현하겠습니다 한 것이기 때문에 모두 오버라이딩 해줘야 함
    public void turnOn() { // public을 지우고 void turnOn()으로 하면 에러 -> 구현을 하는 메소드는 무조건 public을 붙여줘야함 -> 오버라이딩 하는 순간
        System.out.println("Turn on TV");
    }

    private int currentVolume = 10;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("Television mute");
        } else {
            System.out.println("Television not mute, volume = " + currentVolume);
        }
    }
}
