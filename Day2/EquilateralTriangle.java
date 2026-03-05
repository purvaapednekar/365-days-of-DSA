package assignment.two;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        float area = (1.732f / 4) * side * side;
        System.out.println("Area of Equilateral triangle : " + area);

    }
}
