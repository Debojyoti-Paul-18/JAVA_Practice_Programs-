public class Solid_Rectangle_star {
    public static void main(String[] args) {
//        row = 4 - outer loop
//        column = 5 - inner loop
        int n = 4;
        int m = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
