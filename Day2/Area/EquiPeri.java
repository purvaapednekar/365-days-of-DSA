package assignment.two;

import java.util.Scanner;

//perimeter of equilateral triangle
public class EquiPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side : ");
        int side = sc.nextInt();

        int perimeter = side * side * side;
        System.out.println("Perimeter of Equilateral triangle : " + perimeter);

    }
}
