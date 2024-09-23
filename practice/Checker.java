
import java.util.*;

class FactorialFinder {
    int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}

class FibonacciSeries {
    static void getFibonacci(int N) {
        int prev = 0, curr = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(prev + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
    }
}

class PalindromeChecker {
    boolean checkPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }
}

class PrimeChecker {
    static int i = 2;

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == i) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        i++;
        boolean result = isPrime(n);
        i = 2;
        return result;
    }
}

public class Checker {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Factorial Finder");
            System.out.println("2. Fibonacci Series");
            System.out.println("3. Palindrome Checker");
            System.out.println("4. Prime Number Checker");
            System.out.println("5. To exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to find factorial: ");
                    int n = sc.nextInt();
                    FactorialFinder finder = new FactorialFinder();
                    System.out.println("The factorial of " + n + " is " + finder.getFactorial(n));
                    break;
                case 2:
                    System.out.println("Enter the number of terms to print: ");
                    int x = sc.nextInt();
                    FibonacciSeries.getFibonacci(x);
                    break;
                case 3:
                    System.out.println("Enter the number to check palindrome: ");
                    int a = sc.nextInt();
                    PalindromeChecker checker = new PalindromeChecker();
                    if (checker.checkPalindrome(a)) {
                        System.out.println(a + " is a Palindrome.");
                    } else {
                        System.out.println(a + " is not a Palindrome number.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the number to check Prime or not: ");
                    int b = sc.nextInt();
                    PrimeChecker primer = new PrimeChecker();
                    if (primer.isPrime(b)) {
                        System.out.println(b + " is a Prime number.");
                    } else {
                        System.out.println(b + " is not a Prime number.");
                    }
                    break;
                case 5:
                    System.out.println("Tata bye bye....");
                    break;
                default:
                    System.out.println("Invalid command or choice!");
                    break;
            }
						System.out.format("----------------------------------------------------------------------------\n");
        } while (choice != 5);
    }
}
