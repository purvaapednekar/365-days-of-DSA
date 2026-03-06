package assignment.two.volume;

import java.util.Scanner;

public class Pyramid {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter length : ");
            int length = sc.nextInt();

            System.out.print("Enter base : ");
            int base = sc.nextInt();

            System.out.print("Enter radius : ");
            int height = sc.nextInt();

            float volume = (length * base * height) / 3f ;
            System.out.println("Volume of pyramid : " + volume);




    }

}
