import java.util.Scanner;
public class Area_and_Perimeter {

    // Method to calculate area
    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Method to calculate perimeter
    public static int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        // Calling methods
        int area = calculateArea(length, breadth);
        int perimeter = calculatePerimeter(length, breadth);

        // Displaying results
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
