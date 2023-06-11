package ch05.sec01;

public class SmartPhone extends Phone { // SmartPhone은 Phone의 필드를 다 상속 받음
    // SmartPhone이 Phone을 상속 받으면, SmartPhone 객체를 만드는 순간 Phone 객체가 만들어지긴 함
//    public String model;
//    public String color;
    public boolean wifi;

    public SmartPhone() {

    }

    public SmartPhone(String model, String color, boolean wifi) {
        // 여기 안에 정보가 담겨 있음
        // 1.3.SmartPhone이 Phone을 상속 받는 순간
//        super(); // 1.4.super 키워드를 통해 Phone의 빈 생성자를 불러오는 것을 자동으로 추가해줌. this는 자신의 객체, super은 부모의 객체
        // 1.6. super(); 에서 에러가 뜨는데, Q. 뜨는 이유가 뭘까요? super()은 Phone의 파라미터가 없는 빈 생성자가 없기 때문에, 생성자가 하나라도
        // 1.6. 있으면 기본 생성자는 만들어주지 않기 때문에 에러가 뜨는 것 이다.
        super(model, color); // 1.7. 따라서 이렇게 해주면 해결 된다. 이 super는 자동으로 생성해주는게 아니기 때문에 직접 해줘야 한다.(조심)
        // 2.4. super(model, color): 부모 클래스는 자식 클래스의 생성자 안에서 가장 위에서 호출 되어야 함
        this.wifi = wifi;
//        this.model = model;
//        this.color = color;
    }

    @Override // 2.2. 오버라이딩인지 아닌지 명확하게 체크해주는 것
    public void bell() { // 2.2. bell 함수를 재정의 했는데 에러가 나지 않았다. 부모의 똑같은 함수를 상속 받을때, 재정의하면서 상속을 받는 경우를
        // 2.2. 오버라이딩 이라고 한다.
        // 2.2. 오버라이딩은 파라미터가 일단 같아. 같은 파라미터를 가지면서 같은 이름을 가지는 이 함수가 자식 클래스에서 부모 클래스 그대로껄 사용하지 않고
        // 2.2. 재정의 하고 싶을 때 오버라이딩을 사용한다.
        super.bell(); // 2.4.나는 부모의 bell함수를 먼저 호출하고 수정하고 싶다. 얘는 위치 상관X
        System.out.println("The smartphone rings.");
    }

    public void bell(String ringing) { // 2.3. 같은 클래스 안에서 같은 이름을 갖고 서로 다른 파라미터를 갖는 함수를 2개 이상 선언하는 것을
        // 2.3. 오버로딩 이라고 한다.
    }

    //    @Override // 2.2. 얘는 오버라이드 아니다! 오류 뜸
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("The wifi state is changed.");
    }

    public void internet() {
        System.out.println("The internet is connected.");
    }
}
//
//class Galaxy extends SmartPhone { // 3.1. SmartPhone 클래스가 final 이면
//    // 3.1. final 클래스를 부모로 가질 수 없다. -> final 클래스는 누군가의 부모가 될 수 없다.
//
////    @Override
////    public final void setWifi(boolean wifi) { // 3.2. 메소드가 final이라 오버라이드를 할 수 없다.
////        this.wifi = wifi;
////        System.out.println("The wifi state is changed.");
////    }
//
//    public void setWifi(boolean wifi) { // 3.2. 어떤 메소드가 final이면 이걸 상속받는건 괜찮은데, 오버라이드를 해서 재정의 하는 것은 불가능하다.
//        this.wifi = wifi;
//        System.out.println("The wifi state is changed.");
//    }
//}