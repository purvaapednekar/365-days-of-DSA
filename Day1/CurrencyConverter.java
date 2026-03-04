package assignment.one;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your currency in rupees : ");
        int rupees = sc.nextInt();

        int USD = rupees * 92;
        System.out.println("Converted into $ : " + USD);
    }
}
