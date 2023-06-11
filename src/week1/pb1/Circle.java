package week1.pb1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Center and radius 입력: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.println("Point 입력: ");
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();

        // x: 중심좌표, y: 중심좌표, r: 반지름, p1: 해당 점 포함, p2: 해당 점 포함
        if (Math.pow(r, 2) > (Math.pow(x - p1, 2) + Math.pow(y - p2, 2))) {
            System.out.println("This is in the circle.");
        } else {
            System.out.println("This is not in the circle.");
        }
    }
}
