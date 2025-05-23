import java.util.*;

public class CF_2020A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n=scanner.nextInt();
            long k=scanner.nextInt();
            if (k == 1 || k > n) {
                System.out.println(n); 
                continue;
            }
            int ans = 0;
            while (n > 0) {
                if (n % k != 0) {
                    ans += n % k;
                }
                n /= k;
            }
    
            System.out.println(ans);
        }
    }
}
