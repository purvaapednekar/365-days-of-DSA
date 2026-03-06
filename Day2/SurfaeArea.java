package assignment.two.surfaceArea;

import java.util.Scanner;

public class TotalOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area : ");
        int area = sc.nextInt();

        float TSA = 6 * (area * area);
        System.out.println("Total surface area of cube : " + TSA);

    }
}
