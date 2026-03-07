package assignment.two.volume;

import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        float volume = (3.14f * radius * radius * height) / 3;
        System.out.println("Volume of cone : " + volume);

    }
}
