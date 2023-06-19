package lecture9;

public interface RemoteControl {
//    public int c; // error: final인데 초기화가 안되어 있음
//    protected int b; // error: 인터페이스 안에 필드들은 public static final 이어야함
    int MAX_VOLUME = 10; // 변수 default: public static final
    public void turnOn(); // 메서드 default: public abstract

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute");
        } else {
            System.out.println("Not Mute");
        }
    }

    static void changeBattery() {
        System.out.println("changeBattery");
//        setMute(false); // error: default 메서드도 객체가 있어야지만 넣을 수 있음
//        turnOn(); // error: static안에는 non-static이 들어올 수 없다.
//        // 왜? changeBattery는 변수를 선언해 인스턴스를 만들어서 넣어주지 않아도 RemoteControl 클래스를 통해서
//        // 호출할 수 있기 때문인데, turnOn()은 객체가 있어야지만 사용할 수 있기 때문임
    }
}
