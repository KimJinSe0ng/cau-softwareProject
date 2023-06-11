package ch02.pratice;

public class ClassExample {
    public static void main(String[] args) {
        B b = new B();
        b.field1 = 10;
        b.method1();
//        b.field2 = "Tony";
        b.method2();
        Child child = new Child();
        child.method1();
    }
}
