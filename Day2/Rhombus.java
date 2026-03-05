package assignment.two;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal1 : ");
        int d1 = sc.nextInt();

        System.out.print("Enter diagonal2 : ");
        int d2 = sc.nextInt();

        float area = 0.5f * d1 * d2;
        System.out.println("Area of rhombus : " + area);
    }
}
