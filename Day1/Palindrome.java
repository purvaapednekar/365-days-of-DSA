package assignment.one;

public class Palindrome {
    public static void main(String[] args) {
        int num = 151;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }


        if (ans == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
