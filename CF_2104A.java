import java.util.*;
public class CF_2104A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a=scanner.nextLong();
            long b=scanner.nextLong();
            long c=scanner.nextLong();

            long sum =a+b+c;
            if (sum%3 !=0) {
                System.out.println("NO");
                continue;
            }
            long target = sum / 3;
            if (target >= b) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");

            }
        }
    }
}
