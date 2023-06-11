package ch05.sec01;

import ch04.sec01.Calculator;

public class AdvancedCalculator extends Calculator {
    int x;
    AdvancedCalculator(String color) {
        super(color); // 5.1. 어드밴스에는 이걸 사용할 수 있게 되었다. 만약 Calculator의 생성자가 public이 아니면, 에러가 뜬다
        // 5.1. 패키지가 달라지는 순간, 아무리 자식 관계라고 하더라도 이 생성자를 사용할 수 없게 된다.
    }

    void setX(int x, String color) {
        this.x = x;
        setColor(color); // Calculator 클래스에서 setColor 앞의 protected를 뺐다면, 아무리 상속관계여도 default면 그대로 사용할 수 없게 됨
        // 패키지가 다르더라도 자식 관계에 있는 것들을 허용하는게 protected 이다.

//        Calculator cal = new Calculator("Black"); // 6.1. 아무리 Calculator의 상속된 자식 객체라 하더라도, 이 객체 안에 정의된 메소드 안에서
        // 6.1. 객체를 이렇게 생성하게 되면 visible하지 않다.
        // 6.1. 자식클래스임에도 불구하고 위에처럼 super를 통해 상속을 통해 객체를 사용하는게 아닌 객체를 새로 생성해서 생성자를 사용할 수는 없다.
//        cal.setColor("White"); // 6.1. 얘도 visible하지않음. 상속으로 받은게 아니라 cal의 setColor를 호출했기 때문에 protected는 허용되지 않음
        // 물론 패키지 같으면 다 가능함
    }
}
