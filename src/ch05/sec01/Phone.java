package ch05.sec01;

public class Phone {
//    private String model; 라고 하는게 좋음 하지만 상속을 배워야 하기 떄문에
    public String model;
    public String color;

    Phone() {
        System.out.println("The empty constructor is called.");
    }
    Phone(String model, String color) { // 1.5. 해당 파라미터가 있는 생성자를 만들면 빈 생성자는 없어짐
        this.model = model;
        this.color = color;
    }

    public void bell() { // 2.1. bell 메소드가 스마트폰에서 다르다고 해보겠다.
        System.out.println("The bell rings.");
    }

    public void sendVoice(String message) {
        System.out.println("Me: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("Other: " + message);
    }

    public void hangUp() {
        System.out.println("The phone is hanged up.");
    }
}
