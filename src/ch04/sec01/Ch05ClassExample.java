package ch04.sec01;

public class Ch05ClassExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator("Black");
        cal.setColor("White"); // 4.1. protected 접근 제한자는 같은 패키지 안에서는 default와 같다.
    }
}
