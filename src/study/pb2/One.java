package study.pb2;
import java.util.Scanner;
public class One {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 사이즈: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("배열 요소 입력: ");
        int sum = 0;
        // mean
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        int mean = sum / size;
        // variance
        double varsum = 0;
        double variance = 0;
        for (int i = 0; i < arr.length; i++) {
            varsum += (arr[i] - mean) * (arr[i] - mean);
        }
        System.out.println("mean : " + mean + ", variance : " + varsum / size);
    }
}
