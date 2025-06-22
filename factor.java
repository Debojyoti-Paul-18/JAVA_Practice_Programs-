import java.util.Scanner;

public class factor{

    static void findFactors(int num) {
        System.out.println("Factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        findFactors(number);
    }
}