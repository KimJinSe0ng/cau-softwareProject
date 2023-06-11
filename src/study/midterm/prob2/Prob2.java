package study.midterm.prob2;

public class Prob2 {
    public static void main(String[] args) {
        String[] strarr = new String[10];
        strarr[1] = "Today";
        strarr[2] = strarr[1];
        strarr[3] = new String("Today");
        strarr[4] = strarr[3];
        if (strarr[0] == strarr[2]) System.out.println("true1");
        if (strarr[3] == strarr[4]) System.out.println("true2");
        if (strarr[1] == strarr[3]) System.out.println("true3");
    }
}
