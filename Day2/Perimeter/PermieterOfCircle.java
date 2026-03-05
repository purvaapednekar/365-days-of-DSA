package assignment.two;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();

        float perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter of Circle : " + perimeter);
    }
}
