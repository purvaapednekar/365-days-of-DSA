package assignment.two;

import java.util.Scanner;

public class PerimeterParellelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        int perimeter = 2 * (side + base);
        System.out.println("Perimeter of parallelogram : " + perimeter);
    }
}
