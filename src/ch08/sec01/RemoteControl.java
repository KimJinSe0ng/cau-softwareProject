package ch08.sec01;

public interface RemoteControl {
    public static final int a = 10; // public, static, final 만 가능함 -> 어떤 패키지에서도 접근이 가능하게
    int MAX_VOLUME = 10; // 인터페이스는 상수 필드만 가질 수 있음. public static final 안써도 자동으로 대입해줌
    public void turnOn(); // 0.특별한 언급이 없으면, 인터페이스의 모든 메서드는 추상 메서드가 됩니다. (어떤 메서드도 여기서 구현 불가능)

    // (public abstract)가 항상 생략되어 있음
    default void setMute(boolean mute) { // 3.구현부를 갖고 싶게 만들고 싶다면 default를 붙여줌 -> Body를 생성해줘야 한다!
        if (mute) {
            System.out.println("Mute");
        } else {
            System.out.println("Not Mute");
        }
    }

    static void changeBattery() { // 4.static은 이 인터페이스 만으로도 호출할 수 있는 메서드
        System.out.println("Change Battery");
//        turnOn(); // 문제가 생김. static안에는 non-static이 들어올 수 없다.
        // -> turnOn(); 이라는건 객체가 있어야지만 활용할 수 있는 메서드이기 때문에 사용하려하면 오류가 난다.
    }
}
