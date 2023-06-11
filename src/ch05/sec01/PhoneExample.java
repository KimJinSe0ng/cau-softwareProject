package ch05.sec01;

import ch04.sec01.Calculator;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone(); // 1.1.Phone 객체를 따로 생성하지 않아도 밑에 SmartPhone 객체를 생성할 때 자동으로 만들어줌
        // 1.2.그럼 어디에서 호출이 되었느냐?
//        phone.model = "Galaxy S23";
//        phone.color = "Black";
//        phone.bell();
//        phone.sendVoice("Hello");
//        phone.receiveVoice("Thank you");
//        phone.hangUp();

        SmartPhone sm = new SmartPhone("Galaxy S23 Ultra", "White", true);
        sm.bell(); // Phone 의 메소드를 상속받아서 사용할 수 있음
        sm.sendVoice("Nice to meet tou");
        sm.receiveVoice("That's ok");
        sm.setWifi(false);
        sm.internet();

//        Calculator cal = new Calculator("Black"); // 4.2. Calculator의 접근제한자는 default라 패키지가 달라지는 순간 사용할 수 없음
        // 4.2. public으로 하면 문제 없음
//        cal.setColor("White"); // 4.3. 에러가 나는 이유는 protected라서. protected는 부모 자식 관계가 아니면 default와 차이가 없다.
        // 4.3. 어디서 차이가 나냐?
        // 5.1. 아무리 import를 했다고 해더라도 서로 다른 패키지이기 때문에 생성할 수 없게 만들었다. Calculator를.
    }
}
