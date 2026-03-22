package assignment.two.intermediate;

import java.util.Scanner;

public class PowerOfJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        System.out.print("Enter exponent : ");
        int exponent = sc.nextInt();

        double ans = Math.pow(base, exponent);
        System.out.println(ans);
    }
}
