package lecture9;

public class Television implements RemoteControl{

    @Override // 1.RemoteControl의 추상메서드들을 구현하겠습니다 한 것이기 때문에 모두 오버라이딩 해줘야 함
     public void turnOn() { // error: public abstract 가 생략되어 있어서 무조건 public 붙여줘야 함
        System.out.println("Turn on TV");
    }

    private int currentVolume = 10;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("Television Mute");
        } else {
            System.out.println("Television Not Mute, volume = " + currentVolume);
        }
    }

}
