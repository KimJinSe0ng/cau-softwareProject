package ch03.sec01;

/**
 * 클래스는 객체지향 프로그래밍에서 가장 중요한 개념
 * 클래스란 우리가 타입을 따로 만드는 것인데, 클래스는 객체를 직접 만드는게 아니고
 * 내가 만든 객체가 어느 속성을 갖고 있고, 어느 동작을 할 수 있는지 구현하는 작업이다.
 * 클래스를 만드는 걸 통해 객체를 만들 때의 준비작업을 한다고 보면 되고, 클래스를 만든 이후에는
 * 클래스를 사용하는 코드에선 이 클래스에 맞게 객체를 생성해서 프로그래밍 하게 된다.
 */
public class Student {
    /**
     * public class는 어떤 곳에서도 사용할 수 있게 공개하갰다는 의미
     * 이렇게만 해도 클래스가 정의 된거다.
     * 이 자체가 객체는 아니고 틀일 뿐이다.
     * Student.java 를 만든거로 Student라는 타입을 생성한 것이다.
     */
//    String name;
//    int studentNo;
//    char grade;
//    double score; // 이렇게 선언만 했을 때는, 메모리에 값이 할당 되지 않음. 언제 할당됨? 다른데서 student를 생성할 때 생성됨

    String name;
    int studentNo;
    String nation = "Korea"; // 각각의 학생 속성에 해당하는 것을 넣을때는 생성자를 활용해 초기화 하는게 좋다.
    char grade;
    double score; // null값으로 초기화 됨
    //    Laptop laptop; // 다른 곳에서 정의하는 클래스를 하나의 필드로 정의할 수 있음, 이 상태에서 print문을 실행하면 null값임 객체가 만들어진게 아니기 때문
//    Laptop laptop = new Laptop("MacBookM1", 2020); // 기존에 생성자 호출 되고 뒤에 또 호출이 되기 때문에 호출 하지 않고 밑에서만 호출할 수 있게 하면 좋겠다.
    Laptop laptop;

    Student() {

    }
    Student(String name) { // 이런 매개변수를 받은 생성자를 생성하면 디폴트 생성자는 생성되지 않음 -> 수동으로 해줘야함
        // this. 는 객체를 생성할 때 그 객체를 의미한다.
        this.name = name;
    } // 특징이 리턴 타입이 없음, 객체를 생성하는 역할임, 아웃풋이 당연히 student의 객체겠죠

    Student(String name, int studentNo) {
        // name을 초기화하는 함수는 이미 따로 있었는데, 위의 함수를 이용하고 생성자를 추가하고, studentNo도 할당할 수 있게 하는 코드를 생각해보겠다.
        // this : 그 인스턴스
        this(name); // 생성자중에, 매개변수를 String으로 받는 것만 활용해서 먼저 활용하겠다.

//        this.name = name;
        this.studentNo = studentNo;
        // n 과 sn은 name과 studentNO과 다르게 사용했는데, 이유는 name과 studentNO에 그대로 대입할 수 있다.
        // 근데 헷갈릴 수 있잖아요. 이름을 같게 해서 가독성이 좋게 할 수 있다.
        // this를 사용하면, 이렇게 만든 인스턴스의 name에 매개변수로 전달받은 name을 입력받겠다. 라는 것임
    }

    //    Student(String n, int s) { // 오류: 바로 위와 똑같다고 보고 있다. 변수명이 중요하지 않고, 변수의 타입이 똑같으면 동일하다고 본다.
//    }
    Student(String name, int studentNo, char grade) {
        this(name, studentNo); // 이 생성자는 위 생성자를 호출하고 있는 것과 마찬가지이다.
        this.grade = grade;
    }

    Student(String name, int studentNo, char grade, double score,String laptopModel, int laptopYear) {
        this(name, studentNo, grade);
        this.score = score;
        laptop = new Laptop(laptopModel, laptopYear);
    }

    void run() { // 매개변수 없고, 리턴타입 없음
        System.out.println("The student " + name + " is running.");
    }

    void run(double speed) { // 함수도 오버로딩이 가능함
        System.out.println("The student " + name + " is running at " + speed);
    }

    void setGrade(char grade) {
        this.grade = grade; // 맨위의 grade 필드를 매개변수로 받은 grade로 업데이트 시켜주는 함수
    }

    double getGradeNumber() {
        double gradeNummber;
        if (grade == 'A') gradeNummber = 4.0;
        else if (grade == 'B') gradeNummber = 3.0;
        else if (grade == 'C') gradeNummber = 2.0;
        else if (grade == 'D') gradeNummber = 1.0;
        else if (grade == 'F') gradeNummber = 0.0;
        else gradeNummber = -1.0;

        return gradeNummber;
    }

    void sumScores(double ... values) { // score에 값을 넣겠다. values 의 값이 몇개냐에 관계없이 다 받을 수 있게 만들겠다.
        score = 0.0;
        for (int i = 0; i < values.length; i++) {
            score += values[i];
        }
    }
}
