public class Method_Overloading {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();

        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));
        System.out.println("Sum of 5.5 and 4.5: " + obj.add(5.5, 4.5));
    }
}
