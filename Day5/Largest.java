package assignment.two.others;

//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int max = 1;

        while (true) {
            num = sc.nextInt();

            if (num == 0){
                break;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max num is " + max);
    }
}
