package KolokwiumInternetowe2023L.Zad5;

public class HappyNumber {
    public static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 19;
        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
