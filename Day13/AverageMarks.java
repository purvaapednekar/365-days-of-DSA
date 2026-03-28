package assignment.two.intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects : ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of Sub " + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }

        int average = total / n;

        System.out.println("Average of marks is  : " + average);
    }
}
