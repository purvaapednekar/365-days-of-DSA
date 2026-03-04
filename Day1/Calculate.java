package assignment.one;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First num : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second num : ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator : ");
        char op = sc.next().charAt(0);

        int output = 0;
        if (op == '+') {
            output = num1 + num2;
        }

        if (op == '-') {
            output = num1 - num2;
        }

        if (op == '*') {
            output = num1 * num2;
        }

        if (op == '/') {
            output = num1 / num2;
        }

        System.out.println("Your output is " + output);
    }
}
