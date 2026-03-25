package assignment.two.intermediate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hits made by bat : ");
        int hits = sc.nextInt();

        System.out.print("Enter at-bats : ");
        int atBats = sc.nextInt();

        if (atBats == 0) {
            System.out.println("Batting average cannot be calculated.");
        } else {
            double battingAverage = (double)hits / atBats;
            System.out.println("Total batting average is : " + battingAverage);
        }

    }
}
