package assignment.two.intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your product : ");
        String product = sc.next();

        System.out.print("Enter product price : ");
        int price = sc.nextInt();

        float discount = price * 10/ 100f;
        System.out.println("You will get a discount of " + discount + " on your product " + product);
    }
}
