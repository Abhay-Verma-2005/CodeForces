import java.util.*;

public class CF_2032A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[2*n];
            for(int i = 0; i < 2*n; i++) {
                a[i] = scanner.nextInt();
            }

            int c0=0;
            int c1=0;

            for(int i = 0; i < 2*n; i++) {
                if(a[i] == 0) {
                    c0++;
                } else {
                    c1++;
                }
            }
            int max=n-Math.abs(c0-c1)/2;
            int min=c1%2;
            System.out.println(min+" "+max);
        }
    }
}