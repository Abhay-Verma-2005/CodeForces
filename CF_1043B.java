import java.util.*;

public class CF_1043B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
         while (t-- > 0) {
            long n =scanner.nextLong();
            int cnt=count(n, 1);
            if (cnt==0) {
                System.out.println(0);
            } else {
                System.out.println(cnt);
                check(n,1);
                System.out.println();
            }
        }
        
    }
    public static void check(long n, long m){
            long k=(long)Math.pow(10,m)+1;
            if(k>n) return;
        check(n, m+1);

            if (n%k==0) {
            long c=n/k;
            System.out.print(c+" ");
        }
        }
    public static int count(long n, long m) {
        long k = (long)Math.pow(10, m) + 1;
        if (k>n) return 0;
        int ans=0;
        if (n%k==0) ans++;  
        return ans+count(n, m+1);
    }
}
