import java.util.Scanner;

public class CF_1749A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] rooks = new int[m][2];
            for (int i = 0; i < m; i++) {
                rooks[i][0] = scanner.nextInt();
                rooks[i][1] = scanner.nextInt();
            }
            if (m < n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
