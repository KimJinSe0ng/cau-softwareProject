package week1.pb3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("세 변의 길이를 입력하세요");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x + y > z && y + z > x && x + z > y) {
            System.out.println("삼각형입니다.");
        } else {
            System.out.println("삼각형이 아닙니다.");
        }
    }
}
