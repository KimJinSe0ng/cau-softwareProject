package lecture7;

public class AnimalPractice {
    public static void main(String[] args) {
        Animal animal = new StreetCat();
        Cat cat = new StreetCat();
        Animal animal2 = cat;
        if (cat == animal2) System.out.println("Same");
        animal.method1();
//        StreetCat streetCat = (StreetCat) animal;
//        streetCat.method3();
        ((StreetCat)animal).method3();

//        Tree tree = new Tree();
//        Animal animal3 = (Animal) tree; // error: 상속관계가 아니어서 에러

        Animal animal3 = new Animal();
        Cat cat2 = (Cat) animal3; // error: Exception error
        // Animal 객체로 생성했는데, Cat으로 캐스팅하게 되면, 없었던 Cat에 있는 필드와 메서드가 생기게 되므로 에러
        // 자식 객체로 캐스팅하는건, 부모 타입에서 자식 타입으로 변환시키는 상황에서 해야 함
    }
}