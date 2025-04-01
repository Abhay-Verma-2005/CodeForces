import java.util.*;

public class CF_2055A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int tcase = 0; tcase < t; tcase++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if ((a + b) % 2 == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
