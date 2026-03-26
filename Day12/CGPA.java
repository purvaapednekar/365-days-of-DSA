package assignment.two.intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects : ");
        int n = sc.nextInt();
        
        double sum = 0;

        for (int i = 1; i <= n ; i++) {
            System.out.println("Enter grade point of : " + "sub" + i);
            double grade = sc.nextDouble();
            sum += grade;
            
        }
        
        double cgpa = sum / n;
        System.out.println(cgpa);
    }
}
