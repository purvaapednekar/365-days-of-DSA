package assignment.two.volume;

import java.util.Scanner;

public class Sphere {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter radius : ");
            int radius = sc.nextInt();

            float volume = (4 * 3.14f * radius * radius * radius) / 3 ;
            System.out.println("Volume of cylinder : " + volume);


    }

}
