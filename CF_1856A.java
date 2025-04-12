import java.util.Scanner;

public class CF_1856A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long res = 0, cur = 0;
            
            for (long i = 0; i < n; i++) {
                long x = scanner.nextLong();
                if (x < cur) {
                    res = Math.max(res, cur);
                }
                cur = x;
            }
            
            System.out.println(res);
        }
    }
}
