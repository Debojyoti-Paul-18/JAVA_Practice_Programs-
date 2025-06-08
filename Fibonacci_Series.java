// Program 1: Fibonacci using Recursion
public class Fibonacci_Series {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci Series using Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}



// Program 2: Fibonacci Series using Loop
//import java.util.Scanner;
//public class FibonacciLoop {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of terms: ");
//        int n = sc.nextInt();
//
//        int a = 0, b = 1;
//
//        System.out.println("Fibonacci Series:");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//    }
//}
