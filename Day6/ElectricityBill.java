package assignment.two.intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current reading : ");
        int currentReading = sc.nextInt();

        System.out.print("Enter previous reading: ");
        int previousReading = sc.nextInt();



        int unitsUsed = currentReading - previousReading;

        if (unitsUsed < 0) {
            System.out.println("Invalid input");
            return;
        }

        int totalCost = 0;

        if (unitsUsed <= 100){
            totalCost = unitsUsed * 3;
        } else if (unitsUsed <= 200) {
            totalCost = (100 * 3) + ((unitsUsed - 100) * 5);
        } else {
            totalCost = (100 * 3) + (100 * 5) + ((unitsUsed - 200) * 7);
        }


        int fixedCharges = 100;
        int taxes = totalCost /10;

        int bill = totalCost + fixedCharges + taxes;

        System.out.println("Units used: " + unitsUsed);
        System.out.println("Your current month bill is " + bill + "rupees");
    }
}
