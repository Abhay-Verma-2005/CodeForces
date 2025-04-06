import java.util.Scanner;

public class CF_2051B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int ans = 0;

            // case 1;
            int s = a + b + c;
            int d = n / s;
            n = n % s;
            ans += d * 3;

            // case 2;
            if (n > 0) {
                if (n <= a) {
                    ans += 1;
                } else if (n <= a + b) {
                    ans += 2;
                } else {
                    ans += 3;
                }
            }

            System.out.println(ans);
        }
    }
}
