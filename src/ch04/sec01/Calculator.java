package ch04.sec01;

public class Calculator {
    String color; // 객체 안에 소속된 필드를 인스턴스 필드라고 함
    static double pi = 3.14; // Calculator 클래스의 고유한 특성, 객체가 초기화 될 때마다 다른 값으로 초기화 될 필요 없음
    // 정적 필드는 객체에 소속되어 있는 것이 아니기 때문에, 객체가 생성되기 전에 초기화 되어야 함. 바로 필드에 값을 넣는 경우가 많다.
//    -> 생성자 안에서 초기화 하는건 부자연스럽다. 생성자는 객체가 생성될 때 초기화 하는 것이기 떄문이다. 따라서 생성되기 전에 초기화하는게 자연스럽다.
//    -> 그런데 저희가, 복잡하게 초기화 할 때가 있습니다. 생성자에서 하는게 아니고, static 블록을 사용할 수 있다.
    static final double PI1; // 객체가 생성되기 전에도 초기화되고, 바꿀 수가 없고, 객체랑 관계 없이 변하지 않는 값을 상수라고 부르겠다.
    // 객체마다 생성될 필요 없고, 여러개의 값을 가질 필요 없다.
    static double inverse_pi;

    // final 필드는 constant 상수다. 초기화 한번 되면 바뀔수 없다.
    // 초기화 방법은 1. 선언과 동시에 초기화, 2. 생성자에서 초기화

    static { // 객체가 생성되기 전에 이 블록이 먼저 실행되서 메소드 영역으로 올라감
        PI1 = 3.14;
        inverse_pi = 1 / PI1;
//        color = "black"; // 객체 생성되기 전에 초기화 한 것이기 때문에 에러
    }
//    double pi = 3.14;  이렇게 할 수 있지만, 메모리 사용면에서 비효율적이다.
//    -> 이 것의 특징은 각자 개체의 특성이 아니고, Calculator 클래스의 특징 이라고 보면 됨, Calculator 의 모든 인스턴스가 공유되는 특성 : 클래스의 정적멤버 라고 부름
//    어떤 속성이 각각 개체에 따라 달라지는 속성이 아니고, 해당 클래스의 속성일 경우, 정적 필드라고 함
//    static 이라고 선언된 변수는, 객체에 생성되는게 아니고, 클래스 자체가 메소드 영역에 저장이 되는데, 메소드 영역의 일부로 저장이 된다.
//    인스턴스를 생성하는 틀 안에 이 변수가 들어있는거야. 메모리를 이 pi를 위해 하나하나 할당할 필요가 없는 것이다.
    protected Calculator(String color) {
        this.color = color; // 필드 초기화 되는게 먼저이기 때문에, 생성자는 다음 순서여서 에러이다.
    }

    protected void setColor(String color) { // 객체에 종속되어 있음, 해당 객체의 color를 필드에 대입하는 것이기 때문임
        // 객체에 소속된 메소드를 인스턴스 메소드라고 함
        this.color = color; // color가 final필드면, 에러다. -> color를 바꿔주는 함수이기 때문이다.
    }

    static int plus(int x, int y) { // 객체의 필드를 사용하지 않고 있음. -> static이라고 하면 좋음
        // static 메소드는 각자의 객체의 필드를 사용하지 않고 매개변수에만 의존하는 함수
        // 객체 특성에 의존하는 함수가 아님
        // 정적메소드에 대해 다시 말하자면, 정적메소드에서 인스턴스 멤버를 사용할 수 없음
        // 이 메소드를 사용할 떄, Calculator의 객체를 선언하지 않은 채로, plus함수를 쓸 수 있었는데,
        // 인스턴스 멤버가 있기도 전에, 정적 멤버로만 사용했다는 것이죠
//        String z = color; // 정적 메소드라 인스턴스 멤버를 포함할 수 없다.
//        this.color; // this도 Calculator 객체 스스로를 말하는데, 객체가 있다는 가정하에 자신의 객체를 말하기 때문에 따라서 불가능
//        Calculator cal = new Calculator("Black");
//        cal.color = "White";
        return x + y;
    }

    // 정적 메소드에선, 정적 필드만 사용할 수 있고, 인스턴스 멤버나 메소드를 사용할 수 없다.
    // 객체가 만들어지기 전에 사용될 수 있어야 하기 때문이다.
    // 그래도 사용하고 싶다면 객체를 만들어야 한다. 위와 같이 객체를 생성하고 쓴다.
}
