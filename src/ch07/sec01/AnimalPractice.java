package ch07.sec01;

public class AnimalPractice {
    public static void main(String[] args) {
        Animal animal = new StreetCat(); // 부모클래스의 자식 객체를 넣는 것, StreetCat이 Animal로 타입변환이 일어났다.
        // 자신의 상위타입으로 아래 있는 클래스가 자동으로 형변환이 일어나서 대입될 수 있는 것이다.(promotion)
        Cat cat = new StreetCat();
        Animal animal2 = cat; // 만들어놓은 cat을 Animal에 대입할 수 있음, 같은 객체를 가리키고 있음

        if (cat == animal2) System.out.println("same");
        animal.method1();
//        StreetCat streetCat = (StreetCat) animal;
//        streetCat.method3();
        ((StreetCat) animal).method3();

//        Tree tree = new Tree();
//        Animal animal3 = (Animal) tree; // 상속관계가 아니면 타입변환 불가능
        Animal animal3 = new Cat();
        Cat cat2 = (Cat) animal3; // 1.컴파일에러가 뜸. 원래 객체가 자식이고 타입이 부모로 선언되었을 때, 자식객체로 강제타입변환을 하는건 허용이 되지만
        // 1.부모 객체를 자식 타입으로 변환하려 할 때 에러가 뜬다.
//        System.out.println(animal.street); // StreetCat 객체이지만, Animal 타입이라, Animal 에 있는 필드나 메서드만 사용 가능함
        // 부모 클래스의 필드나 메서드만 사용 가능함
    }

}
