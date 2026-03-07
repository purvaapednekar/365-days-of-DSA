package assignment.two.others;
//1281. Subtract the Product and Sum of Digits of an Integer
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n /= 10;
            count++;
        }

        int output = product - sum;
        System.out.println(output);


    }
}
