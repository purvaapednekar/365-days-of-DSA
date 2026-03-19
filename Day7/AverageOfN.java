package assignment.two.intermediate;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers would u like to enter : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter no. " + i + ":");
            int num = sc.nextInt();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Average of your input : " + average);
        
    }
}
