package study.midterm.prob1;

public class Prob1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        byte a = 10;
        byte b = 20;
//        byte c = x + y;
//        char d = x / y;
        int c = x + y;
        int d = x / y;
        char e = 10 + 20;
        long f = x - y;
        float g = x * y;

        int h = 10;
        int i = 20;
        int j = a + b;
//        char k = a * b;
        int k = a * b;
        long l = a - b;
        float m = a / b;
        double n = (double) (a / b);

        String str1 = String.valueOf(10 + 40 + 30);
        String str2 = "10" + 40 + 30;
        String str3 = 10 + "40" + 30;
        String str4 = "10" + 40 + "30";
        System.out.println("c : " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
    }
}
