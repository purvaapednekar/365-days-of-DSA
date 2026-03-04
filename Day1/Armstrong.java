package assignment.one;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int ans = 0;
        while(num > 0) {
            int rem = num % 10;
            ans = ans + (rem*rem*rem);
            num /= 10;
        }

        if (original == ans) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
