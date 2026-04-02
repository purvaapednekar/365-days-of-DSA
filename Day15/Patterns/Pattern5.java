package com.PatternProblems;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;

//        for (int i = 0; i < 2 * n; i++) {
//            int totalCols = i >= n ? 2 * n - i - 1 : i;
//            for (int j = 0; j < totalCols ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
