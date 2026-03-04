package assignment.one;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal : ");
        int principal = sc.nextInt();

        System.out.print("Enter ROI : ");
        int ROI = sc.nextInt();

        System.out.print("Enter Time : ");
        int time = sc.nextInt();

        int SI = principal * ROI * time / 100;
        System.out.println("Simple Interest = " + SI);

    }
}
