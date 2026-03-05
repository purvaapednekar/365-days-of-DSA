package assignment.two;

import java.util.Scanner;

public class Parellelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        int area = height * base;
        System.out.println("Area of parallelogram : " + area);
    }
}
