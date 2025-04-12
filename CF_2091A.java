import java.util.*;

public class CF_2091A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int c0 = 3, c1 = 1, c2 = 2, c3 = 1, c5 = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) c0--;
                else if (arr[i] == 1) c1--;
                else if (arr[i] == 2) c2--;
                else if (arr[i] == 3) c3--;
                else if (arr[i] == 5) c5--;
                if (c0 <= 0 && c1 <= 0 && c2 <= 0 && c3 <= 0 && c5 <= 0) {
                    System.out.println(i + 1);
                    break;
                }
                if (i == n - 1) {
                    System.out.println(0);
                }
            }
        }

    }
}
