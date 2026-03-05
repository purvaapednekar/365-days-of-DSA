package assignment.two;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        float areaTriangle = 0.5f * base * height;

        System.out.println("Area of triangle : " + areaTriangle);
    }
}
