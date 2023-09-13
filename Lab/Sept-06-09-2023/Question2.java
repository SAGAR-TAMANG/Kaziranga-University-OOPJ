import java.util.Scanner;

public class Question2 {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int num = lowerBound; num <= upperBound; num++) {
            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }

            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
        
        scanner.close();
    }
}
