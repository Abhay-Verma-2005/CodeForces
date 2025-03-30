import java.util.Scanner;

public class CF_2008B {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int tc = ss.nextInt();

        while (tc-- > 0) {
            int sz=ss.nextInt();
            String s=ss.next();
            int zeros = 0;
            for (char c : s.toCharArray()) {
                if (c=='0') {
                    zeros++;
                }
            }
            int sqrtSz = (int) Math.sqrt(sz);
            if (sqrtSz*sqrtSz==sz && (sqrtSz-2) * (sqrtSz-2) == zeros) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
