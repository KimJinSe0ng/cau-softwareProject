package week6.pb4;

import java.util.Scanner;

public class ReservationExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SeatType seatS = new SeatType(16);
        SeatType seatA = new SeatType(16);
        SeatType seatB = new SeatType(16);

        System.out.println();
        System.out.println("This is a reservation system for music concert.");
        while (true) {
            System.out.println();
            System.out.printf("Reverse: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.printf("Seat Type S(1), A(2), B(3) >> ");
                int selectType = scanner.nextInt();
                if (selectType == 1) {
                    System.out.printf("S >> ");
                    seatS.reserve();
                } else if (selectType == 2) {
                    System.out.printf("A >> ");
                    seatA.reserve();
                } else if (selectType == 3) {
                    System.out.printf("B >> ");
                    seatB.reserve();
                } else {
                    System.out.println("invalid type.");
                }
            } else if (select == 2) {
                System.out.printf("S >> ");
                seatS.search();
                System.out.printf("A >> ");
                seatA.search();
                System.out.printf("B >> ");
                seatB.search();
                System.out.println("This is the end of the search.");
            } else if (select == 3) {
                System.out.printf("Seat Type S(1), A(2), B(3) >> ");
                int selectType = scanner.nextInt();
                if (selectType == 1) {
                    System.out.printf("S >> ");
                    seatS.cancel();
                } else if (selectType == 2) {
                    System.out.printf("A >> ");
                    seatA.cancel();
                } else if (selectType == 3) {
                    System.out.printf("B >> ");
                    seatB.cancel();
                } else {
                    System.out.println("invalid type.");
                }
            } else if (select == 4) {
                seatA.quit();
                break;
            } else {
                System.out.println("invalid menu.");
            }
        }
    }
}