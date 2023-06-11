package ch04.sec01;

//import ch03.sec01.Student;
import ch03.sec01.*; // ch03안의 패키지안에 있는 모든걸 쓸 수 있다.
//import ch03.*; // 하위 패키지를 다 포함하지 않음. ch03안의 클래스들을 사용하겠다.

public class ClassExample {
    int field;

    public static void main(String[] args) { // main함수도 static인데, ClassExample안에 소속된 객체의 함수가 아니라 사용할 수 있음
//        Calculator.pi = 5.14; // 정적 변수는 변경 가능하다. constant 상수가 아니다.
//        ClassExample c = new ClassExample();
//        c.field = 10;

        // 다른 패키지 안에 있는 Student는 명시해야 함, 패키지는 클래스를 사용하는데 효율적으로 관리하기 위한 개념
//        Student st1 = new Student("Mike"); // 에러가 뜬다 왜 그러냐????? 해당 생성자가 public이 아님
        // -> Student가 not visible하다. -> 접근 제한자 때문이다.
        // public이나 명시가 안되어있는 것을 접근 제한자라고 함
        // protected는 상속을 배워야 정확히 이해 가능해서 나중에 말함
        // public : public Class Student -> public은 제한이 없다. 어디서든 사용 가능하게 접근을 풀어놨다. -> 패키지를 넘나 들어도 문제 없다.
        // default(아무것도 없음) : 같은 패키지안의 것들은 사용할 수 있고, 패키지 밖에서는 사용할 수 없게 만든 제한자
        // private : 같은 패키지이지만 클래스가 달라져도 쓸 수 없고, 같은 클래스 내에서만 쓸 수 있다. -> 다른 클래스에서 값 변경 불가능
        // Class Student : Class 에는 private를 붙일 수 없다.
        Student st2;
        double result1 = 10 * 10 * Math.PI; // Calculator 안의 정적변수 pi를 사용하겠다.
        int result2 = Calculator.plus(10, 5); // 객체에 소속되어 있는게 아니기 때문에 사용할 수 있다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("inverse pi = " + Calculator.inverse_pi);

        // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ Car 클래스
//        Car car = new Car(); 싱글톤이라 객체가 더이상 생성이 안되죠
        Car car = Car.getInstance(); // getInstance함수로 불러옴
        Car car2 = Car.getInstance(); // singleton 변수가 가리키고 있는 Car 객체를 동일하게 가리킨다.
        // 따로따로 선언한 것 처럼 보이지만 사실상 singleton 변수에 해당하는 객체를 둘다 가리키고 있다.
        if (car == car2) { // 주소 값 같은지 확인
            System.out.println("These are the same.");
        } else {
            System.out.println("These are not the same.");
        }
//        car.speed = -1; // 직접 접근할 수 없음, 에러 뜸
        car.setSpeed(2); // 실제 객체를 구현하는 사람은 2를 사용하지만, 실제 사용하고 호출하는 사람은 7.2인거처럼 보이는거야 -> setSpeed안에서 컨트롤 가능
//        System.out.println(car.speed); // km/h
        System.out.println(car.getSpeed()); // private 값을 불러오는 방법
        System.out.println(car.isStop());
        car.setStop(true);
        System.out.println(car.getSpeed()); // private 값을 불러오는 방법
        System.out.println(car.isStop());
        car.run();
    }
}
