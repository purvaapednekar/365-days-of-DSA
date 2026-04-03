package assignment.two.intermediate;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter present value : ");
        int presentValue = sc.nextInt();

        System.out.print("Interest value : ");
        int rate = sc.nextInt();

        System.out.print("Enter time : ");
        int time = sc.nextInt();

        double r = rate / 100.0;
      
        double futureValue = presentValue * Math.pow((1 + r), time);
        double round = Math.round(futureValue * 100.0) /100.0;
      
        System.out.println(round);

    }
}
