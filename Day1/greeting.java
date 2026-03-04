package assignment.one;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();

        System.out.println("Welcome " + name);
    }
}
