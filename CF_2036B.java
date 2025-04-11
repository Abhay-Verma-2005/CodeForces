import java.util.*;

public class CF_2036B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            int k = scanner.nextInt(); 
            int[] b = new int[k];
            int[] c = new int[k];
            int maxB = 0;

            for (int i = 0; i < k; i++) {
                b[i] = scanner.nextInt();
                c[i] = scanner.nextInt();
                if (b[i] > maxB) maxB = b[i];
            }

            int[] ans = new int[maxB]; 

            for (int i = 0; i < k; i++) {
                ans[b[i] - 1] += c[i];
            }

            Arrays.sort(ans);
            int sum = 0;

            for (int i = ans.length - 1; i >= Math.max(0, ans.length - n); i--) {
                sum += ans[i];
            }

            System.out.println(sum);
        }
    }
}
