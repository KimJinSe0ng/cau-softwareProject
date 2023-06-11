package week5.pb2;

import javax.swing.*;
import java.util.Scanner;

public class MonthSchedule {
    Day[] schedule;
    Scanner scanner = new Scanner(System.in);
    public MonthSchedule(int day) {
        // 배열에 접근하기 쉽게, 0번 인덱스는 사용하지 않는 용도로, day+1 만큼 생성
        this.schedule = new Day[day+1];
    }

    void input() {
        System.out.printf("Date(1-30)? ");
        int input = scanner.nextInt();
        System.out.printf("Do list (without space)? ");
        String toDo = scanner.next();
        schedule[input].set(toDo);
    }

    void view() {
        System.out.printf("Date(1-30)? ");
        int input = scanner.nextInt();
        schedule[input].show();
        System.out.println(" on the " + input + "th.");
    }

    void finish() {
        System.out.println("This is the end of the program.");
    }
    void run() {
        // 객체 초기화
        for (int i = 0; i < schedule.length; i++) {
            schedule[i] = new Day();
        }
        System.out.println("This is a schedule management program for this month.");
        while (true) {
            System.out.print("Command(Insert: 1, Show: 2, Quit: 3 >> ");
            int select = scanner.nextInt();
            if (select == 1) {
                input();
            } else if (select == 2) {
                view();
            } else if (select == 3) {
                finish();
                break;
            } else {
                System.out.printf("incorrect input");
            }
        }
    }
}
