import java.util.*;

public class CF_2042A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr); 
            int sum = 0;
            for (int i = n - 1; i >= 0; i--) { 
                if (sum + arr[i] <= k) {
                    sum += arr[i];
                } else {
                    break;
                }
            }
            System.out.println(k - sum);
        }
    }
}