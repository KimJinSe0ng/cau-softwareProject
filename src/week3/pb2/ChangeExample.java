package week3.pb2;

import java.util.Scanner;

public class ChangeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input : aajava,bb,cc,javdd,javalove
        System.out.print("String 입력 : ");
        String[] array = scanner.nextLine().split(",");

        for (String element : array) {
            if (element.contains("java")) {
                System.out.println(element + ": " + element.contains("java") + " , " + element.replace("java", "python"));
            } else {
                System.out.println(element + ": " +element.contains("java"));
            }
        }
    }
}
