import java.util.*;

public class CF_1987A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            n--;
            System.out.println(1+n*k);
        }
    }
}