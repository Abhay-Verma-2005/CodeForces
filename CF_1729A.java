import java.util.Scanner;

public class CF_1729A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int x = a - 1;
            int y = b - c;
            int z = c - 1;
            int a2 = Math.abs(y);
            int a3 = Math.abs(z);
            int t1 = Math.abs(x);
            int t2 = a2 + a3;
            if (t1 < t2) {
                System.out.println("1");
            } else if (t2 < t1) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
