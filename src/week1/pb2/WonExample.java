package week1.pb2;

import java.util.Scanner;

public class WonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("money 입력 : ");
        int money = scanner.nextInt();

        int[] bills = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < bills.length; i++) {
            if (money >= 0) {
                counts[i] = money / bills[i];
                money %= bills[i];
            }
            System.out.println(bills[i] + "won : " + counts[i]);
        }
    }
}
