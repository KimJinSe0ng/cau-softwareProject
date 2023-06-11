package ch02.sec01;

public class StringPractice {
    public static void main(String[] args) {

//        String name = "tony"; // 초기화해도 됨
//        String name1 = new String("tony"); // new를 통해서 같은 이름의 객체를 생성하면 다른 객체이다.
//        String name2 = new String("tony"); // 자바에선 리터럴이 같으면 똑같음, 첫번째 tony를 공유해서 씀, 같은 객체이다.
        // name1 = "", name2 = "" 이럴 땐 true이지만!!! new로 생성하면 2개의 주소는 다르다.
        // eqaul 함수는 String 타입의 함수

        String name1 = "java programming java";
//        char charValue = name1.charAt(5);
        int length = name1.length();
        String replaced = name1.replace("java", "python");
        String replaced1 = name1.substring(5,16); // substring(시작인덱스,끝인덱스) 해당하는 인덱스 사이의 데이터만 추출함
        int index = name1.indexOf("java"); // java가 2개 있지만 제일 처음에 나오는 인덱스를 반환함, 없으면 -1 반환함
        boolean result = name1.contains("java");
        if (result) {
            System.out.println("The string is in the total string");
        } else {
            System.out.println("There is not the string in the total string");
        }

        String name2 = "java,programming,python,cpp";
        String[] arr = name2.split(","); // ","를 기준으로 배열에 담아줌
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
