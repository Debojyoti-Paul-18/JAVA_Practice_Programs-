import java.util.Scanner;

public class Recursion {

    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call recursive method
        int result = factorial(num);

        // Display result
        System.out.println("Factorial of " + num + " is: " + result);

    }
}
