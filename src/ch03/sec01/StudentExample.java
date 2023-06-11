package ch03.sec01;

public class StudentExample {
    public static void main(String[] args) {
        /**
         * student 타입의 st1 변수를 만들었다.
         */
//        Student st1; // Student를 받을 만한 공간을 만들어 놨지만 객체를 만들어 놓지는 않음
        // new가 클래스에서 인스턴스를 (이 객체를) 만들어내는 연산자라고 보면 됨
//        Student st1 = new Student(); // Student 객체를 하나 만들어서 힙 안에 Student를 만들어서 얘 주소 값을 st1에 넣겠다.
        // 클래스 이름으로 만들어진 함수를 "생성자" 라고 한다. 클래스의 중요한 구성 멤버
        // 1. 이름을 같이 명시하고 초기화를 해보고 싶다.
        Student st1 = new Student("Mike", 20220001, 'B', 90.0,"MacBookM2", 2022);
        System.out.println("st1.name = " + st1.name);
        System.out.println("st1.studentNo = " + st1.studentNo);
        System.out.println("st1.grade = " + st1.grade);
        System.out.println("st1.score = " + st1.score);
//        System.out.println("st1.laptop = " + st1.laptop);
        System.out.println("st1.laptop.model = " + st1.laptop.model);
        System.out.println("st1.laptop.year = " + st1.laptop.year);

        st1.run(30);
        st1.setGrade('A');
        System.out.println("st1.grade = " + st1.grade);
        System.out.println("st1.gradeNumber = " + st1.getGradeNumber());
        st1.sumScores(10.0, 20.0, 30.0, 40.0);
        double[] scores = {30.0, 45.0, 66.2};
        st1.sumScores(scores); // 배열로 받아도 됨
        System.out.println("st1.score = " + st1.score);

        Student st2 = new Student("Mike", 20230001); // st1과 st2는 서로 다른 객체를 생성해서 주소 값을 받고 있다.
        st2.name = "Mike";
        System.out.println("s2.name = " + st2.name);
        System.out.println("s2.studentNo = " + st2.studentNo);
        /**
         * 생성자의 매개변수에 따라서 어떻게 초기화가 되어야하는지 다 다르게 구현되어 있다.
         * 함수 이름은 똑같지만 매개변수가 다를때 다른 여러 함수들을 생성, 정의하는 것을 오버로딩이라고 한다.
         * 오버로딩은 매개변수의 타입, 갯수, 순서가 다른 여러개의 생성자를 선언하는 것을 생성자 오보로딩이라고 한다.
         */
//
//        Laptop l1 = new Laptop();
//        System.out.println("l1.model = " + l1.model);
       
    }
}

/**
 * <총정리>
 *     필드를 선언하는 것, 생성자를 선언하는 것, 메소드를 생성하는 것 을 따라해보고, 실제로 메인함수에서 생성자를 통해서 초기화를 하고,
 *     그거의 필드와 메소드를 활용해보는게 좋을 것 같습니다.
 *     st1의 객체를 생성하고, 주소값을 넣은 다음에, st1의 속성에 해당하는 부분들을 불러오거나 업데이트를 하는거라고 볼 수 있고,
 *     지금 만든 이 인스턴스의 동작을 시켜서 setGrade를 하고.. 이 객체를 하나의 속성이 있고 실제로 동작을 수행할 수 있는
 *     생명력이 있는 객체라고 여기고 프로그래밍 할 수 있게 되는 것 입니다.
 * </총정리>
 */
