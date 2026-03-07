package assignment.two.volume;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = sc.nextInt();

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        float volume = base * height;
        System.out.println("Volume of prism : " + volume);

    }
}
