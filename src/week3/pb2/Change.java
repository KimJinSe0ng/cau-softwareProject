package week3.pb2;

import java.util.Scanner;
// aajava,bb,cc,javdd,javalove
public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        System.out.println(str);
        String[] s_list = str.split(",");
        for (int i = 0; i < s_list.length; i++) {
            System.out.println(s_list[i]);
        }
//        boolean ok;
        for (int j = 0; j < s_list.length; j++) {
            if (s_list[j].contains("java")) {
                String change = s_list[j].replace("java", "python");
                System.out.println(s_list[j] + ": true," + change);
            } else {
                System.out.println(s_list[j] + ": false");
            }
        }
    }
}
