package Leetcode;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal : ");
        int principal = sc.nextInt();

        System.out.print("Enter ROI : ");
        int ROI = sc.nextInt();

        System.out.print("Enter time : ");
        int time = sc.nextInt();

        double amount = principal * Math.pow((1 + ROI / 100.0), time);

        double compound = amount - principal;

        System.out.println("Compound Interest : " +compound);
    }
}
