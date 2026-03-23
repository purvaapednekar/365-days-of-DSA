package assignment.two.intermediate;

import java.math.BigInteger;
import java.util.Scanner;

//🟢 Practice Question (Easy)
//
//A laptop costs ₹50,000.
//Its value decreases by 10% every year.
//
//👉 Find the value of the laptop after 2 years.
public class DepricationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of years :- ");
        int years = sc.nextInt();

        double laptopCost = 50000;

        for (int i = 0; i < years; i++) {
            laptopCost = laptopCost * 0.90;
        }

        System.out.println(laptopCost);

    }
}
