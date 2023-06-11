package ch04.sec01;

public class Car {
    String color;
    private double speed; // m/s로 저장된다고 해봄
    private static Car singleton = new Car(); // Car 안에 있는 딱 하나의 정적 변수

    /**
     * 싱글톤패턴
     * 어떤 객체를 생성하는데, 전체 어플리케이션에서 딱 한개의 객체만 생성하고 싶을 때, 다른 것을 생성하면 안되는 객체
     * 사무실에서 프린터가 한 대 밖에 없는데, 사무실에서 한 대를 공유해서 써본다고 했을 때, 각 사람들에 대해 딱 하나의 프린터만 있는거죠
     * 프로그래밍 할 때 프린터는 딱 하나만 객체를 생성하고 그 외엔 생성하지 않고 공유를 해야함
     * 그런 것들을 사용할 수 있도록 하는 객체를 싱글톤패턴으로 적용한다.
     * 내 생각) 먼저 private static 으로 객체를 하나 생성하게 되면, private라 접근을 못하고, static이라 생성자 초기화 하기 전에 만들어져 있다.
     * 추가로, private Car() 를 통해, 생성자 초기화 까지 해놓으면 사용할 수 없다.
     * 따라서 하나의 객체만 생성될 수 밖에 없고, public static Car getInstance() {return singleton;} 을 통해 객체 하나가 담긴
     * 변수를 리턴해주면, 하나의 객체만 공유해서 쓸 수 있게 된다.
     */

    public void setSpeed(double speed) { // 다른 패키지에서도 setSpeed 사용할 수 있게 public하는게 좋음
        // setter를 통해서 값을 업데이트를 하거나
        if (speed >= 0.0) {
            this.speed = speed;
        } else {
            this.speed = 0.0;
        }
    }

    private Car() { // private static Car singleton = new Car();과 private Car() 둘다 프라이빗이면 사용할 수 없잖아요.
    }
    // 싱글톤을 사용할 수 있게 하는 함수는 public으로 만들어 놓고, 이 객체를 직접 만드는게 아니라 static으로 만들어줘야함
    public static Car getInstance() { // getInstance를 통해서 미리 만들어놓은 공유된 하나를 가리키게끔 만들 수 있다.
        return singleton;
    }
    public double getSpeed() {
        // getter를 통해서 객체의 속성을 호출하거나
        return speed * 3.6;
    }

    public boolean isStop() { // getter의 입장인데, isStop 필드가 없는데, 있는거처럼 사용할 수 있다.
        // 실제로 필드로 되어 있는 것 말고, 가공해서 속성을 출력해서 하는 메소드를 getter로 사용 가능
        // boolean 타입은 is~~~로 작성하는 것이 관례
        return speed == 0.0;
    }

    public void setStop(boolean stop) {
        if (stop) speed = 0.0; // stop이라는 필드가 있는게 아닌데 있는 것 처럼 getter와 setter를 할 수 있다.
    }

    public void run() {
        System.out.println("The speed of the car is " + getSpeed() + ".");
    }
}
