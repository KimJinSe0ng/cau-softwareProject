package ch02.sec02;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87}; // 초기화 가능
        String[] scores1 = {"Spring", "Summer", "Fall", "Winter"}; // 초기화 가능
//        String[] scores1;
//        scores1 = {"Spring", "Summer", "Fall", "Winter"}; // 초기화 불가능
        scores1 = new String[]{"Spring", "Summer", "Fall", "Winter"}; // 초기화 가능
//        printItem({1, 2, 3}); // 이렇게는 못함
//        printItem(new int[]{1, 2, 3}); // 이렇게는 가능

        int[] intArray = new int[5]; // 0으로 초기화 되어있다.
        String[] strArray = new String[5]; // nu;;로 초기화 되어 있다.
        String[][] strArray1 = new String[5][3]; // 2차원배열로 만들고 싶다면
        String[][] strArray2 = {{"apple", "banana","egg"}, {"cat", "duck"}};
        strArray[2] = "String";
//        strArray.length = 4; // final 필드라 대입 못함

        String[][] strArray3 = new String[2][];
        strArray3[0] = new String[3];
        strArray3[1] = new String[2];

        int[] arr1 = {5, 4, 3};
        int[] arr2 = new int[5];

        // arraycopy() : arr1의 인덱스~를 arr2의 인덱스~로 arr1.length 만큼 복사함
        System.arraycopy(arr1, 1, arr2, 2, arr1.length -1);
        int sum = 0;
        for (int score : arr1) {
            sum += score;
        }

//        for (int i = 0; i < arr2.length; i++) {
//            sum += arr2[i];
//        }
        System.out.println("sum : " + sum);
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]:" + scores[i]);
        }
    }
}
