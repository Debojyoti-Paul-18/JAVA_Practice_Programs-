public class Inverted_Triangle_star {
    public static void main(String[] args) {
//                    * * * * *
//                     * * * *
//                      * * *
//                       * *
//                        *

        int sp = 20;
        for (int i = 5; i >= 1; i--) {
            // Print spaces
            for (int k = 5; k <= sp; k++) {
                System.out.print(" ");
            }
            sp++;

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
