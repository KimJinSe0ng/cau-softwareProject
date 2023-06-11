package week9.pb6;

import java.util.Scanner;

public class Calculator {

    Calc cal;
    Scanner scanner = new Scanner(System.in);

    void setCalculator(Calc cal) {
        // to do
        this.cal = cal;
    }

    void run() {
        // to do
        System.out.print("Write two integers >> ");
        String[] arr = scanner.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        cal.setValue(a, b);
        System.out.println(cal.calculate());
    }
}
