package week3.pb1;

import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 사이즈 입력: ");
        int size = scanner.nextInt();
        System.out.print("배열에 넣을 숫자들 입력:");
        int[] num_list = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            num_list[i] = scanner.nextInt();
            sum += num_list[i];
        }
        double mean = 0;

        mean = sum / size;
        double varsum = 0;
        double variance = 0;
        double result = 0;
        for (int k = 0; k < size; k++) {
            varsum += (num_list[k] - mean) * (num_list[k] - mean);
        }
        result = varsum / size;
        System.out.println("mean: " + mean + " variance: " + result);
    }
}
