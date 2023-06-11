package week3.pb1;

import java.util.Scanner;

public class ComputeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("배열의 사이즈 입력 : ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.printf("배열에 넣을 요소들 입력 : ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        int mean = sum / size;
        double varSum = 0;
        double variance = 0;
        for (int i = 0; i < size; i++) {
            varSum += (array[i] - mean) * (array[i] - mean);
            variance = varSum / size;
        }
        System.out.println("Mean : " + mean);
        System.out.println("variance = " + variance);
    }
}
