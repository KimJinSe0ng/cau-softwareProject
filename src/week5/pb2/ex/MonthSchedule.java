package week5.pb2.ex;

import java.util.Scanner;

public class MonthSchedule {
    Day[] days;

    Scanner scanner = new Scanner(System.in);

    public MonthSchedule(int day) {
        this.days = new Day[day + 1];
    }

    void input() {
        System.out.printf("Date(1-30)? ");
        int day = scanner.nextInt();
        System.out.printf("Do list(without space)? ");
        String toDo = scanner.next();
        days[day].set(toDo);
    }

    void view() {
        System.out.printf("Date(1-30)? ");
        int day = scanner.nextInt();
        System.out.println(days[day].get() + " on the " + day + "th");
    }

    void finish() {
        System.out.println("This is the end of program");
    }

    void run() {
        System.out.println("This is a schedule management program for this month.");
        // days 배열 초기화
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }

        while (true) {
            System.out.print("Command(Insert: 1, Show: 2, Quit: 3) >> ");
            int command = scanner.nextInt();
            if (command == 1) {
                input();
            } else if (command == 2) {
                view();
            } else if (command == 3) {
                finish();
                break;
            } else {
                System.out.println("Incorrect Command.");
            }
        }
    }

}
