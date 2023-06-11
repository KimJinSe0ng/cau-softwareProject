package week6.pb4;

import java.util.Scanner;

public class SeatType {

    Scanner scanner = new Scanner(System.in);
    Seat[] seat;

    int size;

    public SeatType(int size) {
        this.size = size;
        this.seat = new Seat[size + 1];
        for (int i = 0; i < size + 1; i++) {
            seat[i] = new Seat();
        }
    }

    void reserve() {
        for (int i = 1; i <= size; i++) {
            System.out.printf(seat[i].getName() + " ");
        }
        System.out.println();
        System.out.printf("Name >> ");
        String reserveName = scanner.next();
        System.out.printf("Seat Number >> ");
        int seatNumber = scanner.nextInt();
        if (seatNumber < seat.length) {
            seat[seatNumber].setName(reserveName);
        } else {
            System.out.println("invalid seat number.");
        }
    }

    void search() {
        for (int i = 1; i <= size; i++) {
            System.out.printf(seat[i].getName() + " ");
        }
        System.out.println();
    }

    void cancel() {
        for (int i = 1; i <= size; i++) {
            System.out.printf(seat[i].getName() + " ");
        }
        System.out.println();
        System.out.printf("Name >> ");
        String cancelName = scanner.next();
        for (int j = 1; j <= size; j++) {
            if (cancelName.equals(seat[j].getName())) {
                // 취소하고 싶은 사람의 이름이 예약 명단에 있으면 삭제
                seat[j].setName("---");
                return;
            }
        }
        System.out.println("No one has made a reservation under that name.");

    }

    void quit() {
        System.out.println("Thank you!");
    }
}
