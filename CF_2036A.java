import java.util.*;

public class CF_2036A {
    private static boolean okDiff(int a, int b) {
        int d = Math.abs(a - b);
        return d == 5 || d == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            boolean perfect = true;
            for (int i = 1;i < n;i++) {
                if (!okDiff(a[i], a[i - 1])) {
                    perfect = false;
                    break;        
                }
            }
            System.out.println(perfect?"YES":"NO");
        }
    }
}
