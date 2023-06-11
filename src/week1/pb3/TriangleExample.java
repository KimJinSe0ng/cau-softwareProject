package week1.pb3;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 변의 길이를 차례대로 입력하세요.");
        // 세 변의 길이 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b) > c & (b + c) > a & (a + c) > b) {
            System.out.println("These lines can construct triangle.");
        } else {
            System.out.println("These lines cannot construct triangle.");
        }
    }
}
