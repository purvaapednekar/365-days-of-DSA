package assignment.two.surfaceArea;

import java.util.Scanner;

public class CurvedOfCylinder {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();

        float CSA = 2 * 3.14f * radius * height;
        System.out.println("Curved surface area of cylinder : " + CSA);
                

    }
}
