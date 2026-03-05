package assignment.two;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        int radius = sc.nextInt();

        float areaCircle = 3.14f * radius * radius;
        System.out.println("Area of Circle : " + areaCircle);
    }
}
