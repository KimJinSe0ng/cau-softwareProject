package week1.pb2;

import java.util.ArrayList;
import java.util.Scanner;

public class Won {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("돈을 입력하세요: ");
        int money = scanner.nextInt();

        int[] units = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < units.length; i++) {
            if (money >= 0) {
                int q = money / units[i];
                money %= units[i];
                count[i] = q;
            }
        }
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + "won : " + count[i]);
        }
    }
}
