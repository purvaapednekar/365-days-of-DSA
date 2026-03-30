package assignment.two.intermediate;

import java.util.Scanner;


public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += (rem * rem * rem);
            n /= 10;
            count ++;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
