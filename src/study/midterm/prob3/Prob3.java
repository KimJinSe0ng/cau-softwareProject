package study.midterm.prob3;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the nucleic sequences >> ");
        String genomes = scanner.nextLine();
        String[] strarr = genomes.split(",");
        for (int i = 0; i < strarr.length; i++) {
//            System.out.println(strarr[i]);
            if (strarr[i].length() < 9) System.out.println("Genome " + i + ": Not sufficient length");
            else {
                System.out.println(strarr[i].substring(3, 9));
                if (strarr[i].indexOf("G") == 0 && strarr[i].substring(4, 9).contains("ATC")) {
                    System.out.println("Genome " + i + ": Positive");
                } else {
                    System.out.println("Genome " + i + ": Negative");
                }
            }
        }
    }
}
// ATCGATCGGTCGTAGTC,ATXGTGTGTGTGTGTGTG,ATCCTA,GTTGTATCTGTG,GATCTTTTTTTTTTTT